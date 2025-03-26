public class KthLargestInteger {
    
    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 6, 7, 5};
        secondSmallestAndLargestNum(arr);
    }
    static void secondSmallestAndLargestNum(int [] arr){
        int smallNum = Integer.MAX_VALUE;
        int largeNum = Integer.MIN_VALUE;

        int secondSmallNum = Integer.MAX_VALUE;
        int secondLargetNum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            smallNum = Math.min(smallNum, arr[i]);
            largeNum = Math.max(largeNum, arr[i]);            
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondSmallNum && arr[i] != smallNum) {
                secondSmallNum = arr[i];
            }
            if (arr[i] > secondLargetNum && arr[i] != largeNum) {
                secondLargetNum = arr[i];
            }
        }

        System.out.println(secondLargetNum + " "+ secondSmallNum);
    }
}
