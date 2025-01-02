public class LinearSearch {
    public static void main(String[] args) {

        int [] nums = {23,43,567,89,87,9,-1,-23};

        System.out.println(linearSearch(nums, -1));
        
    }
    // search in the array return the index if item found 
    // other wise if item not found return -1


    static int  linearSearch(int [] arr, int target){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        // for (int i = 0; i < arr.length; i++) {
            
        //     if(arr[i]== target){
        //         return arr[i];
        //     }
        // }
        for (int element : arr) {
            if(element == target){

                return element;

            }
        }
        return Integer.MAX_VALUE;
    }
}
