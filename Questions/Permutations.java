import java.util.ArrayList;
import java.util.List;

public class Permutations{

    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(permute(arr));

    }

    static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        boolean [] freq = new boolean[nums.length];
        List<Integer> ds = new ArrayList<>();
        recuPermute(nums, ds, ans, freq);
        return ans;
        
    }
    static void recuPermute(int [] nums, List<Integer> ds, List<List<Integer>> ans, boolean [] freq ){

        // base case
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                recuPermute(nums, ds, ans, freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }

    }
}