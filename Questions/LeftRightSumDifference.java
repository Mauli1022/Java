// https://leetcode.com/problems/left-and-right-sum-differences/description/

import java.util.Arrays;

public class LeftRightSumDifference {

    public static void main(String[] args) {
        int [] num = {7,3,21,31};
        
        System.out.println(Arrays.toString(leftRightDifference1(num)));

    }
    static int [] leftRightDifference(int [] nums){

        int n = nums.length;
        int totalSum = 0;

        if (n == 1) {
            return new int[]{0};
        }

        int [] leftSum = new int[n];
        int [] rightSum = new int[n]; 
        int [] ans = new int[n];
       
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];  
        }
        
        leftSum[0] = 0;
        rightSum[0] = totalSum - nums[0];
        //left Sum
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i-1] + nums[i-1];
            rightSum[i] = rightSum[i-1] - nums[i];
        }

        // Right Sum 
        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
       
        return ans;
    }


    static int[] leftRightDifference1(int[] nums) 
    {
        int total=0;
        int left=0,right=0;
        int[] arr=new int[nums.length];
       
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];//total sum of array
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i-1>=0)
            {
                left+=nums[i-1];//left array elements sum
            }
            right=total-left-nums[i];//right array elements sum 
            arr[i]=(int)Math.abs(left-right);
        }
        return arr;
    }
}
