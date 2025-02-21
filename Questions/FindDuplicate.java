// import java.util.Arrays;
import java.util.HashMap;
public class FindDuplicate {
    public static void main(String[] args) {
        int [] arr = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));

    }
    /* 
    static int findDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i-1] == nums[i]) {
                return nums[i];
            }
        }

        return 1;
    }
    */

    static int findDuplicate(int[] nums) {

        HashMap <Integer, Integer> ans = new HashMap<>();

        for (int num : nums) {
            ans.put(num, ans.getOrDefault(num, 0) + 1);
            if (ans.get(num) > 1) {
                return num; 
            }
        }
        return -1;
    }
}
