import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import java.util.Collections;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(arr));
        // threeSum(arr);
    }

    /* 
    static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                for (int k = j + 1; k < nums.length; k++) {

                    if ((nums[i] + nums[j] + nums[k]) == 0) {
                        List<Integer> innerList = new ArrayList<>();
                        innerList.add(nums[i]);
                        innerList.add(nums[j]);
                        innerList.add(nums[k]);

                        Collections.sort(innerList);
                       
                        if (!ans.contains(innerList)) {
                            ans.add(innerList);
                        }

                    }
                }

            }
        }

        return ans;
    }

    */

    static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        // sort the arr
        Arrays.sort(nums);  // sort is void function which does not return any new array

        for (int i = 0; i < nums.length; i++) {
            
            // check if nums[i] == nums[i-1] then continue
            if (i > 0 && nums[i] == nums[i-1]) continue;

            // initialize j and k
            int j = i + 1, k = nums.length-1;

            while (j < k) {

                // calculate the sum 
                int sum = nums[i] + nums[j] + nums[k];

                // check for sum
                if (sum < 0) {
                    j++;
                }else if (sum > 0) {
                    k--;
                }else{
                    // create new 
                    List<Integer> temp = new ArrayList<>();

                    // add the three element in temp array
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);

                    ans.add(temp);
                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j-1]) j++; 
                    while (j < k && nums[k] == nums[k+1]) k--; 

                }
                
            }
        }

        return ans;
    }




}
