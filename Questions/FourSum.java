import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FourSum{
    public static void main(String [] args){
        int [] arr = {1,0,-1,0,-2,2};
        int target = 0;

        System.out.println(fourSum(arr, target));

    }

    static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue; 

            for (int j = i+1; j < nums.length; j++) {

                if (j > i + 1 && nums[j] == nums[j-1]) continue;

                int k = j + 1, l = nums.length-1;

                while ( k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum < target) {
                        k++;
                    }else if(sum > target){
                        l--;
                    }else{
                        List<Integer> temp = new ArrayList<>();

                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);

                        ans.add(temp);

                        k++;
                        l--;

                        while (k < l && nums[k] == nums[k-1]) k++;
                        while (k < l && nums[l] == nums[l+1]) l--;
                    }
                }
                
            }
            
        }


        return ans;
    }

}