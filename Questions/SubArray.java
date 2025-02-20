// https://leetcode.com/problems/subarray-sum-equals-k/

public class SubArray {
    public static void main(String[] args) {
        int [] arr = {1,1,1};
        System.out.println(subArray(arr, 2));
        // subArray(arr, 2);
    }
    static int subArray(int [] nums, int p){

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;
            for(int j=i;j<nums.length;j++){

                sum = sum + nums[j];
                if(sum == p){
                    count += 1;
                }
            }
            
        }

        return count;
    }
}
