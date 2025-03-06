import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 5, 13, 6, 12, 4, 1 };
        // int[] arr = { 0 };
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    
    static int[] sortArrayByParity(int[] nums) {

        int s = 0;
        int e = nums.length - 1;

        while (s < e) {

            int even = nums[s] % 2;
            int odd = nums[e] % 2 ;

            if (even != 0 && odd == 0) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }else if(even == 0 && odd != 0){
                s++;
                e--;
            }else if(even == 0){
                s++;
            }else if(odd != 0){
                e--;
            }

        }

        return nums;

    }


    /* 
    static int[] sortArrayByParity(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
    
        while (s < e) {
            if (nums[s] % 2 > nums[e] % 2) { 
                // Swap when left is odd and right is even
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
            }
    
            if (nums[s] % 2 == 0) s++; // Move forward if even
            if (nums[e] % 2 == 1) e--; // Move backward if odd
        }
    
        return nums;
    }
    */

}
