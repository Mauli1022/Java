public class FindSingleElement {
    public static void main(String[] args) {
        int [] arr = {7,7,10,11,11,12,12};
        System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] nums) {

        int s = 0;
        int e = nums.length-1;

        while(s <= e){

            int m = s + (e - s) / 2;

            if(nums[m] != nums[m-1] && nums[m] != nums[m+1]){
                return nums[m];
            }

            if((m % 2 == 0 && nums[m] == nums[m+1]) || 
            (m % 2 == 1 && nums[m] == nums[m - 1]) ){
                s = m + 1 ;
            }else{
                e = m - 1;
            }
        }

        return -1;
        
    }
}
