import java.util.Arrays;

public class MaxItem {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 35, 76, 87, 89, 32, 23 };

        // System.out.println( max(arr));
        // System.out.println(maxValInRange(arr, 0, 4));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    // work on edge cases here, like array being null
    // imagin that arr is not empty
    static int max(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        // let asume max item is at index 0
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        return maxVal;
    }

    static int maxValInRange(int[] arr, int start, int end) {

        if (end > start) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }

        // let asume max item is at index 0
        int maxVal = arr[0];
        for (int i = start; i < end; i++) {

            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        return maxVal;
    }

    // method to reverse the array

    static void reverseArray(int[] arr) {

        // two pointer method
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // increment the start 
            start++;
            // decreament the end
            end--;

        }

        // return 1;
    }

}
