import java.util.Arrays;

public class TwoSum1 {
     public static void main(String[] args) {
        int [] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
        
     }
     static int[] twoSum(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
            
            while (start<=end) {
    
                int sum = nums[start] + nums[end];
                System.out.println(sum);
                
                if(sum > target){
                    System.out.println(start +" "+ end);
                    end--;
                }else if(sum < target){
                    System.out.println(start +" "+ end);
                    start++;
                }else{
                    return new int[]{start,end};
                }
    
            }            
            return new int[]{-1,-1};
            
        }
}
