// https://takeuforward.org/data-structure/find-the-largest-element-in-an-array/

import java.util.Arrays;

public class LargestElementInArray {

    public static void main(String [] args){

        int [] arr = {2,5,8,1,3,0};
        System.out.println(sort(arr));
        System.out.println(Arrays.toString(arr));

    }
    static int largestElementInArray(int [] nums){

        int largestNum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > largestNum) {
                largestNum = nums[i];
            }
            
        }
        return largestNum;
    }

    static int sort(int [] nums){
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
    
}
