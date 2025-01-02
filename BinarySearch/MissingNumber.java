// https://leetcode.com/problems/missing-number/?envType=problem-list-v2&envId=binary-search&difficulty=EASY
public class MissingNumber {

    public static void main (String [] args){

        int [] arr = { 0,1,3};
        // System.out.println(missingNumber(arr));
        missingNumber(arr);

    }
    static int missingNumber(int[] nums){

        int sum = 0, n = nums.length;
        int n1 = 0;

        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            //  n1 = Math.max(sum, nums[]);
        }
        System.out.println(sum);

        // gauess therom to calculate addition of continues number(array)
        // (largest_number * (largest_number + 1)) / 2
        int num = (n * (n + 1) / 2);
        System.out.println(num);

        return num;
    }
    
}
