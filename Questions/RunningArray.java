import java.util.Arrays;

public class RunningArray {
    public static void main(String [] args){
        int [] nums = {1,2,3,4};
        int[] arr = runningSum(nums);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] runningSum(int[] nums) {

        int newArr[] = new int[nums.length];
        // int a = 0;
        newArr[0] = nums[0];
        for (int i = 1; i < newArr.length; ++i) {
            newArr[i] = newArr[i-1] + nums[i];
        }
    
        
        return newArr;
    }

}
