import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 34;
        arr[3] = 65;
        arr[4] = 13;

        // input using for loop
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = in.nextInt();

        // }
        // // Array iteration;
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("Array Element"+arr[i]);
        // }
        // for(int num : arr){
        //     System.out.print(num + " ");
        // }

        // System.out.println(arr[5]); //index out of bound

        // System.out.println(Arrays.toString(arr));
        // System.out.println(arr.type);


        // array of object 
        String [] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = in.nextLine();
        }
        str[3] = "Mauli";
        System.out.println(Arrays.toString(str));
    }
}
