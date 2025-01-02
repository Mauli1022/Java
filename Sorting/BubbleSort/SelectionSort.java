import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {-5,-3,-10,0,1,2,9,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int [] nums){
        for(int i=0;i<nums.length;i++){
            // find the max item in the remaining array and swap with correct index
            int last = nums.length- i - 1;
            int maxIndex = getMaxIndex(nums, 0, last);

            swap(nums, maxIndex, last);
        }
    }
    // function to the max index
    static int getMaxIndex(int [] arr, int start, int end){
        int max = start;

        for(int i=start; i <= end; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        
        return max;
    }
    // function to swap the Numbers
    static void swap(int [] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
