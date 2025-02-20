
// https://leetcode.com/problems/merge-sorted-array/description/?envType=problem-list-v2&envId=two-pointers
//https://leetcode.com/problems/squares-of-a-sorted-array/description/
import java.lang.reflect.Array;
import java.util.Arrays;

public class MergSortedArray {

    public static void main(String[] args) {
        int[] num1 = { 1, 2, 3, 0, 0, 0 };
        int[] num2 = { 2, 5, 6 };

        int m = 3; // How many present in nums1;
        int n = 3; // How many present in nums2;

        /*
         * if (num1[m+n-1] <= num2[n-1] && num1[m+n-1] <= num1[m-1] ) {
         * // swap nums1[c] with nums2[b];
         * num1[m+n-1] = num2[n-1 ];
         * }
         */

        // System.out.println(Arrays.toString(num1));

        // merge(num1, m, num2, n);
        // System.out.println(Arrays.toString(num1));



        int[] nums = { -4, -1, 0, 3, 10 };
        System.out.println(Arrays.toString(squareArray(nums)));

        // squareArray();
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {

        int a = m - 1;
        int b = n - 1;
        int c = m + n - 1;

        while (b >= 0) {
            if (a >= 0 && nums1[a] > nums2[b]) {
                nums1[c--] = nums1[a--];
            } else {
                nums1[c--] = nums2[b--];
            }
        }

    }

    static int[] squareArray(int [] nums) {

        // int[] nums = { -4, -1, 0, 3, 10 };
        // for (int i = 0; i < nums.length; i++) {
        //     nums[i] = nums[i] * nums[i];
        // }

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 1; j < (nums.length - i); j++) {
        //         if (nums[j - 1] > nums[j]) {
        //             // swap elements
        //             int temp = nums[j - 1];
        //             nums[j - 1] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }
        // // System.out.println(Arrays.toString(nums));
        // return nums;



        int s = 0;
        int e = nums.length;


        while (s <= e) {
            
        }

        return nums;
    }
}
