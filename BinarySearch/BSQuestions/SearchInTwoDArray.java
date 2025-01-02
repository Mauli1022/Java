package BSQuestions;
// https://leetcode.com/problems/search-a-2d-matrix/description/?envType=problem-list-v2&envId=binary-search
public class SearchInTwoDArray {
    public static void main(String[] args) {
        int [][] nums = {
            { 1, 3, 5, 7 },
            { 10,11,16,20 },
            { 23, 30, 34,60 }
        } ;
        // System.out.println(binarySearch(nums[0], 6));
        for(int i=0;i<nums.length-1;i++){
            
        }
    }
    static int binarySearch(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        
        while (s <= e) {

            int m = s + (e - s) / 2;

            if(target < nums[m]){
                e = m - 1;
            }else if(target > nums[m]){
                s = m + 1;
            }else{
                return m;
            }
            
        }
        return -1;
    }
}
