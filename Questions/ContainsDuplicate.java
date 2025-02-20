//  https://leetcode.com/problems/contains-duplicate/description/
import java.util.Arrays;
import java.util.HashSet;
// import java.util.Hashtable;

public class ContainsDuplicate {
    
    public static void main(String[] args){
        
        int [] arr = { 1,2,3 };
        System.out.println(containsDuplicate(arr));

    }
    static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
       
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
        
    }

    static boolean containsDuplicate1(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }
}
