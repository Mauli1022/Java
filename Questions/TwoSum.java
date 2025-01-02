import java.util.Arrays;

public class TwoSum {


    public static void main(String[] args) {
        int [] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));

    }

    static int[] twoSum(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        while (start < end) {

            if(nums[start] + nums[end] == target){
                return new int[]{start,end};
            }else if (nums[start] + nums[end]>=target) {
                end--;
            } else {
                start++;
            }
            
        }

        return new int[]{-1,-1};
    }
}
