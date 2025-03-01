import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class MajorityElementTwo{
    public static void main(String[] args) {
        int [] arr = {1,2,1,2,1};
        // System.out.println(findMajority(arr));
        System.out.println(majorityElement(arr));
        // System.out.println(arr.length/3);
    }

    static List<Integer> majorityElement(int[] nums) {
        ArrayList <Integer> ansList = new ArrayList<>();
        Hashtable <Integer,Integer> ht = new Hashtable<>();

        int majorityCount = nums.length / 3;

        for(int num : nums){
            ht.put(num, ht.getOrDefault(num,0)+1);

            // int tempCount = ht.get(num);
            // if (tempCount > majorityCount) {
            //     majorityCount = tempCount;
            // }
        }

        for (Integer integer : ht.keySet()) {
            if (ht.get(integer) > majorityCount) {
                ansList.add(integer);
            }
        }

        return ansList;
    }

    // Boyer moore Majority Algorithm-------------------------------------
    static int findMajority(int[] nums){
    int count = 0, candidate = -1;

    // Finding majority candidate
    for (int index = 0; index < nums.length; index++) {
      if (count == 0) {
        candidate = nums[index];
        count = 1;
      }
      else {
        if (nums[index] == candidate)
          count++;
        else
          count--;
      }
    }

    // Checking if majority candidate occurs more than
    // n/2 times
    count = 0;
    for (int index = 0; index < nums.length; index++) {
      if (nums[index] == candidate)
        count++;
    }
    if (count > (nums.length / 2))
      return candidate;
    return -1;

  }
}