package BSQuestions;

public class FIndPivot {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(findRotation(arr));
    }
    static int findPivot(int [] arr ){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + ( end - start ) / 2;

            if(mid < end && arr[mid] > arr [ mid + 1 ]){
                return mid;
            }

            if(mid > start && arr[ mid ] < arr[ mid - 1 ]){
                return mid -1;
            }

            // To satisfy this condition we need this array
            // [5, 6, 1, 2, 3, 4] where start is greater than the middle element
            // i.e.  1<=5 is arr[mid]<arr[start] = arr[2]<arr[0] 
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            /*
             * to Satisfy this condition this array need 
             * [3, 4, 5, 6, 1, 2] where start is smaller than the middle element
             * i.e. arr[mid] > arr[start] = arr[2]>arr[0] 5>3
             */
            else{
                start = mid + 1;
            }
        }

        return -1;
    }

    static int findRotation(int [] arr){
        int piovt = findMin(arr);
        return piovt + 1;
    }
    
    // Find Pivot Element
    static int findMin(int[] nums) {

        int s = 0;
        int e = nums.length-1;

        while(s <= e){
            int m = s + (e - s)/ 2;

            if( m < e && nums[m]>nums[m+1]){
                return m;
            }
            if(m > s && nums[m]<nums[m-1]){
                return m - 1 ;
            }

            if(nums[m] <= nums[s]){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        return -1;
        
    }
    
}
