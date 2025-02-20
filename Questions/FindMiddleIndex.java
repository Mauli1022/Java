// https://leetcode.com/problems/find-the-middle-index-in-array/description/
public class FindMiddleIndex {
    
    public static void main(String[] args) {
        int [] arr = { 2,3,-1,8,4 };
        System.out.println(findMiddleIndex(arr));
    }
    static int findMiddleIndex(int[] nums) {

        int sum  = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];  
        }

        for (int i = 0; i < nums.length; i++) {
            temp = temp + nums[i];
            if(sum == temp){
                return i;
            }
            sum -= nums[i];
        }
        
        return -1;
    }
}
