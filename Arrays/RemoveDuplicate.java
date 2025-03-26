public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr = {1, 2, 2, 2, 3};
        // System.out.println(removeDuplicates(arr, 5));
        
    }
    static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        // int count = 1;
        // for(int i=1;i<n;i++){

        //     if(arr[i] != arr[i-1]){
        //         count++;
        //     }

        // }

        // return count;


        int i = 0;
        for (int j = 1; j < n; j++) {

            if (arr[j] != arr[j - 1]) {
                arr[i++] = arr[j];
            }
        }
        return i + 1;
    }
}
