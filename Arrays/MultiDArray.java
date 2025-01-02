import java.util.Arrays;
import java.util.Scanner;

public class MultiDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
            1 2 3 4
            4 3 2 1
            5 6 7 8
            8 7 6 5 
         */

        //  int [][] arr = new int[3][];

        // int [][] twoArr = {
        //     {1,2,3},
        //     {4,5,},
        //     {6,7,8,9,10}
        // };

        // for(int i = 0; i < twoArr.length;i++){
        //     for(int j = 0; j < twoArr[i].length;j++){
        //         System.out.print(twoArr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // input : 
        int [][] arr = new int[3][3];

        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[i].length;j++){
               arr[i][j] = sc.nextInt();
            }
        }

        // for(int i = 0; i < arr.length;i++){
        //         for(int j = 0; j < arr[i].length;j++){
        //             System.out.print(arr[i][j] + " ");
        //         }
        //         System.out.println();
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(Arrays.toString(arr[i]));
        // }

        for(int[] num : arr){
            System.out.println(Arrays.toString(num));
        }

       
    }
}
