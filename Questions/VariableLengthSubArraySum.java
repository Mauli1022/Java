// https://leetcode.com/problems/sum-of-variable-length-subarrays/description/?envType=problem-list-v2&envId=prefix-sum
public class VariableLengthSubArraySum {
    
    public static void main(String[] args) {

        int [] arr = {3,1,1,2};
        System.out.println(subarraySum(arr));
    }
    static int subarraySum(int[] nums) {

        int n = nums.length;
        int sum = 0;

        for(int i=0;i<n;i++){
            int s = Math.max(0,i-nums[i]);
            for(int j = s; j <= i; j++){
                sum +=nums[j];
            } 
        }
        
        return sum;
    }
}
