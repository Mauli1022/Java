package BSQuestions;

public class Celing {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 10;
        System.out.println(findCeling(arr,target));
        System.out.println(findFloor(arr, target));
    }

    // function to find ceiling of number
    // but what if the target is greater than the greatest number in the array(which is the celing)
    static int findCeling(int [] arr, int target){

        int start = 0;
        int end = arr.length-1;

        
        if(target > arr[arr.length-1]){
            return -1;
        }


        while ( start <= end) {

            int mid = start + ( end - start ) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

            if(arr[mid] == target)return mid;

        }
        
        return arr[start];
    }

    // function to find the floor of number
    static int findFloor(int [] arr , int target){

        int start = 0;
        int end = arr.length-1;

        if(target < arr[0]) return -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

            if (arr[mid] == target ) return mid;
            
        }

        return arr[end];
    }
}
/*
 *     start <= end  ---> when while loop breaks start = end + 1
 *     no answer found so next number will be  == start element 
 */
