// https://leetcode.com/problems/intersection-of-two-arrays/description/?envType=problem-list-v2&envId=binary-search&difficulty=EASY

// import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class ArrayIntersection {

    public static void main(String[] args) {
        int [] arr1 = {1,2,2,1};
        int [] arr2 = {2,1}; 
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        // Add all elements from nums1 to a set
        for (int num : nums1) {
            set1.add(num);
        }

        // Check intersection with nums2
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectionSet.add(num); // To avoid duplicates
            }
        }

        // Convert result to int[]
        int[] result = new int[intersectionSet.size()];
        int i = 0;
        for (int num : intersectionSet) {
            result[i++] = num;
        }

        return result.length > 0 ? result : new int[]{-1}; // Return {-1} if no intersection
    }  
}
