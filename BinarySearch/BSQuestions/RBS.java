package BSQuestions;

public class RBS {
    // Rotated Binary Search
    // https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1438009529
    public static void main(String[] args) {

        int [] arr = {6,7,8,9,10,1,2,3,4,5,6};
        int [] newArr = {2,2,2,2,8,9,10,2,2,2,2,2,2,2};
        int target = 9;

        int piovt = findPivotWithDuplicateNum(arr);
        // int firstTry = binarySearch(arr, target, 0, piovt);

        // if(firstTry != -1){
        //    System.out.println(firstTry);
        // }else{
        //     int secodTry = binarySearch(arr, target, piovt+1, arr.length-1);
        //     System.out.println(secodTry);
        // }
        System.out.println(search(newArr, target));
        
    }
    static int search(int [] nums, int target ){
        int pivot = findPivot(nums);

        if(pivot == -1){
            binarySearch(nums, target, 0, nums.length-1);
        } 
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot);
        }
        return binarySearch(nums, target, pivot+1, nums.length-1);


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

            if(arr[mid] <= arr[start]){
                end = mid - 1;

            }else{
                start = mid + 1;
            }
        }

        return -1;
    }

    static int binarySearch(int arr[] , int target, int start, int end){

        while (start <= end) {
            
            int mid = start + ( end - start ) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;
    }

    static int findPivotWithDuplicateNum(int [] arr ){

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

            // if element at middle start, end are equal just skip the duplicate
            if(arr[mid] == arr[start] && arr[mid] ==arr[end]){
                // skip the duplicate
                // check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                // check if end is pivot
                if(arr[end]<arr[end-1]){
                    return -1;
                }
                end--;
            }
            // left side is sorted , so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start =  mid + 1;
            }else{
                end = mid -1;
            }
        }

        return -1;
    }
    
}
