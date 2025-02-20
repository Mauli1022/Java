import java.util.Arrays;
public class ThreeSumClosest {
    public static void main(String[] args) {
        int [] arr = {-1,2,1,-4};
        int target = 1;
        threeSumClosest(arr, target);
    }

    static  int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int closestSum = 0;
        int maxDiff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            int j = i+1, k = nums.length-1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == target) {
                    return target;
                }

                int diff = Math.abs(sum - target);
                 if (diff < maxDiff) {
                    maxDiff = diff;
                    closestSum = sum;
                }

                 if (sum < target) {
                    j++; 
                } else {
                    k--; 
                }
            }
        }
        return closestSum;
    }
}

/*
 So i have calculatd sum of triplet 
 next i need to solve how to compare the difference
 */
