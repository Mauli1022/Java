// package BinarySearch;

public class OrderAgnosticsBS {
    public static void main(String[] args) {
        // int [] arr = {99,87,80,76,45,38,29,22,17,10,3,-1};
        int [] arr = { 1,2,3,4,5,6};
        System.out.println(orderAgnosticsBS(arr, 5));
    }

    static int orderAgnosticsBS(int arr[] ,int target){

        int start = 0;
        int end = arr.length-1;

        // int mid = start + (end - start) / 2;

        // find whether the arra is sorted in ascending  or descending 

        boolean isAsc = arr[start] < arr[end];
        // if(arr[start]<arr[end]){
        //     isAsc = true;
        // }else{
        //     isAsc = false;
        // }
     
            while (start<=end) {        
                int mid = start + (end - start) / 2;

                if(arr[mid] == target){
                    return mid;
                }


                if(isAsc){

                    if (target < arr[mid]) {
                        end = mid - 1;
                    }else{
                        start = mid + 1;
                    }

                }else{
                    if (target > arr[mid]) {
                        end = mid - 1;
                    }else{
                        start = mid + 1;
                    }
                }

                
            }
            return -1;
        

    }
}
