public class BS{
    public static void main(String[] args) {
        
    }
    static int search(int [] arr , int target , int s , int e){


        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;

        if(arr[m]<target){
            e = m - 1;
            search(arr, target, s , m - 1);
        }else if(arr[m] > target){
            search(arr, target, m + 1 , e);
        }else{
            return m;
        }

        return m;
    }
}
/*
 Continuation of where to take which variables
*/