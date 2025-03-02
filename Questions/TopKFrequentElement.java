import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequentElement {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3 };
        topKFrequent(arr, 2);
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));
    }

    static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Long> frequencyMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        Queue<Map.Entry<Integer, Long>> minHeap = new PriorityQueue<>(Comparator.comparingLong(Map.Entry::getValue));

        for (Map.Entry<Integer, Long> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.stream()
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
