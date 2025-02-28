import java.util.HashMap;

public class MajorityElement {
    
    public static void main(String[] args) {
        int [] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }


    static int majorityElement(int[] nums) {

        // int majorityCount = nums.length / 2;
        int majorityCount = 0;

        HashMap <Integer,Integer> ht = new HashMap<>();

        for (int num : nums) {
            ht.put(num, ht.getOrDefault(num, 0) + 1);

            int tempCount = ht.get(num);
            if (tempCount > majorityCount) {
                return num;
            }
        }
        return -1;
        
    }

    /*

    // Return highest frequency of the element;
     static int majorityElement(int[] nums) {

        // int majorityCount = nums.length / 2;
        int majorityCount = 0;

        HashMap <Integer,Integer> ht = new HashMap<>();

        for (int num : nums) {
            ht.put(num, ht.getOrDefault(num, 0) + 1);

            int tempCount = ht.get(num);
            if (tempCount > majorityCount) {
                majorityCount = tempCount;
            }
        }
        return majorityCount;
        
    }
     */
}
