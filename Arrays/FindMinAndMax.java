public class FindMinAndMax {

    public static void main(String[] args) {
         int [] arr = {18,45,76,89,-3,76,56,100};

        System.out.println("Min Value "+min(arr));
        System.out.println("Max Value "+max(arr));
    }
    static int min(int [] arr){
        // assume arr.length != 0
        // return the minimum value in teh array
        if(arr.length == 0) return -1;

        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }

        return ans;
    }
    static int max(int [] arr){
        // assume arr.length != 0
        // return the minimum value in teh array
        if(arr.length == 0) return -1;

        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > ans){
                ans = arr[i];
            }
        }

        return ans;
    }
} 
/*
 * find min element in the array
 * 
 * arr = [18,45,76,89,76,56,,100]
 */
