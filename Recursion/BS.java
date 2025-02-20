public class BS{
    public static void main(String[] args) {

        int [] arr = { 1,2,3,5,7,9,10};
        int s = 0;
        int e = arr.length - 1;
 
        System.out.println(search(arr, 15,s,e));
        
    }
    static int search(int [] arr , int target , int s , int e){


        /* 
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;

        if(arr[m]<target){
            // e = m - 1;
            return search(arr, target, s , m - 1);
        }else if(arr[m] > target){
            search(arr, target, m + 1 , e);
        }else{
            return m;
        }

        return m;
        */
    
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if(arr[m] == target){
            return m;
        }

        if(target < arr[m]){
            return search(arr, target, s, m -1);
        }
        return search(arr, target, m + 1 , e);
    }
}
/*
 Continuation of where to take which variables

*/