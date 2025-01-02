package BSQuestions;
// 1095 find in mountain array

public class FindInMountainArray {
    public static void main(String[] args) {
        int [] arr = {10,9,8,7,6,5,4,3,2,1};
        int [] arrNew = {1,2,3,5,6,2,1};
        int target = 6 ;

        System.out.println(findInMountainArray(target,arrNew));
    }

    static int findInMountainArray(int target, int []  arr) {

        // first find the peak
        int peak = findMaxElementInArray(arr);

        int firstTry = orderAgnosticBs(arr, target, 0, peak);
        // if we dont get teh -1 in return the return the ans.
        if (firstTry != -1) {
            return firstTry;
            
        }
        // and if we get -1 in firstTry then search in second half of the array
        return orderAgnosticBs(arr, target, peak + 1, arr.length-1);
    }
    static int orderAgnosticBs(int [] arr, int target, int start , int end){


        boolean orderOfArray = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (orderOfArray) {
                // if Value of Order is true means array in ascending Order
                // do Normal Binary Search

                if (target<arr[mid]) {
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    return mid;
                }

            }else{

                if (target>arr[mid]) {
                    end = mid - 1;
                }else if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    return mid;
                }

            }
            
        }

        return -1;
    }

    static int findMaxElementInArray(int [] arr){

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + ( end - start ) / 2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }  
        }
        return start;
    }
}
