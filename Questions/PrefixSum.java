import java.util.Arrays;

public class PrefixSum {
    
    public static void main(String[] args) {
        int [] myArr = {1,3,5,6,3,8};
        System.out.println(Arrays.toString(prefixSum(myArr)));
    }
    static int [] prefixSum(int [] nums){

        int len = nums.length;
        
        int [] arr = new int[len];

        arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            arr[i] = arr[i-1] + nums[i];
        }

        return arr;
    }
}
