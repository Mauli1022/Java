import java.util.Arrays;

public class Swap{
    public static void main(String [] args){

        int [] arr = { 1,3,35,76,87,89,32};

        swap(arr,0,4);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}