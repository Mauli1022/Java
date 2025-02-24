// https://leetcode.com/problems/contains-duplicate-ii/?envType=problem-list-v2&envId=hash-table

import java.util.HashSet;

public class ContainsDuplicateTwo {

    public static void main(String[] args) {
        int [] arr = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(arr, k));
    }

    /* 
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j] && (Math.abs(i - j) <= k)) {
                    return true;
                }
                
            }
        }

        return false;
    }
    */
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);

            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
    
}
