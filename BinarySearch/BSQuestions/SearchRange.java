package BSQuestions;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 * facebook interview question
 * 34 Find First and last positon of element in sorted array
 */
public class SearchRange {

    public static void main(String[] args) {

        int[] arr = { 5, 7, 7, 7, 7, 8, 8, 10 };
        System.out.println(Arrays.toString(searchRange(arr, 8)));
    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };// initial ans

        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // this function just return the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;

        // Check fo the first occurence if target
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            // System.out.println(mid);

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // Potential ans found
                // return mid;

                ans = mid;

                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;

    }

}