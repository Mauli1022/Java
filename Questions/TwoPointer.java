
public class TwoPointer {
    
    public static void main(String[] args) {
        int [] arr = {2,5,1,7,10};

        System.out.println(twoPointer(arr, 14));

    }
    static int twoPointer(int [] nums, int target){
        int l = 0, r = 0, sum = 0, maxLen = 0;

        while (r < nums.length) {
            sum += nums[r];  // Add the right element
    
            // Shrink window from the left if sum exceeds target
            while (sum > target && l <= r) {
                sum -= nums[l];
                l++;
            }
    
            // Update max length if the sum is valid
            if (sum <= target) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
    
            r++;  // Move the right pointer
        }
        return maxLen;
    }
}
