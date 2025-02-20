// https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=problem-list-v2&envId=binary-search
public class MinSizeSubArraySum {

    public static void main(String[] args) {
        int [] arr = { 1,1,1,1,1,1,1,1};
        // System.out.println(minSubArrayLen(11, arr));
        // minSubArrayLen(7, arr);

        System.out.println(Math.min(3, 1));
        
    }
    static int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        long sum = 0;
        int len = n + 1;

        for (int end = 0, start = 0; end < n; end++) {

            sum += nums[end];

            while (start < n && sum >= target) {
                len = Math.min(len, end - start + 1);
                sum -= nums[start++];
            }
            
        }
        if (len <= n) return len;

        return 0;
    }
    
}
