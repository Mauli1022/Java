public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {34,3,56,88,90,45,12};

        System.out.println(searchInRange(arr, 33, 1, 5));
    }

    static int searchInRange(int [] arr, int target, int start, int end){

        if(arr.length == 0){
            return -1;
        }
        
        for (int i = start; i <= end; i++) {
            
            if(arr[i] == target){
                return i;
            }
        }
        return -1;//return -1 if element does not found
    }
}
/*
 * 
 * arr = [18,45,76,89,76,56,]
 * 
 * que Search for 3 in the range of index [1,4];
 */
