package BSQuestions;
// LeetCode question 852 
public class PeakIndexInMountainArray {

    public static void main(String[] args) {
        int [] arr = {0,1,2,8,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    // function to find max Num in the array
    static int peakIndexInMountainArray(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while ( start < end) {

            int mid = start + (end - start) / 2;
            // System.out.println(mid);

            if(arr[mid] > arr[mid + 1]){
                //you are in dec part of array
                // this my be the ans, but look at the left
                // this is why end != mid - 1
                end = mid ;
            }else{
                // you are in asc part of array
                start = mid + 1;// beacouse we know that mid + 1 element is greater than previous element
            }
            
        }
        // in the end, start == end pointing to th largest number beacouse of above two check
        // start and end are always trying to find max element in the above 2 checks
        // hence when thay are pointing to just one element, that is the max element
        
        return start;
    }
    
}

/*
 find peak in mountain array
    [0,1,0], ans = 1
    [0,2,1,0] ans = 2 
 */
