// https://leetcode.com/problems/single-number/
// https://leetcode.com/problems/single-number-ii/
// https://leetcode.com/problems/single-number-iii/description/


import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SingleNum {
    public static void main(String[] args) {
        int[] arr = { 2, 1 };
        System.out.println(Arrays.toString(singleNumber(arr)));
        // singleNumber(arr);
    }

    static int [] singleNumber(int[] nums) {

        Hashtable<Integer, Integer> ht = new Hashtable<>();
        List <Integer> temp = new ArrayList<>();

        for (int i : nums) {
            ht.put(i, ht.getOrDefault(i, 0) + 1);
        }

        for (int key : ht.keySet()) {
            if (ht.get(key) == 1) {
                temp.add(key);
            }
        }

        return temp.stream().mapToInt(i -> i).toArray();
    }
    static int singleNumberTwo(int[] nums) {

        Hashtable<Integer, Integer> ht = new Hashtable<>();

        for (int i : nums) {
            ht.put(i, ht.getOrDefault(i, 0) + 1);
        }

        for (int key : ht.keySet()) {
            if (ht.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }
}
