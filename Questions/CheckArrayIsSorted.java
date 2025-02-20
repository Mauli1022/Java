//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
public class CheckArrayIsSorted {
    public static void main(String[] args){
        int [] arr = {2,1,3,4};
        System.out.println(check(arr));
    }
    static boolean check(int[] nums) {
        int count=0;
        if (nums[0] < nums[nums.length - 1]) {
            count++;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                count++;
            }
        }

        if(count>1){
            return false;
        }
        return true;

    }
}
