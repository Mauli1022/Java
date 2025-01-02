import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {

        int [] num = {1,2,3,4,5};
        System.out.println(Arrays.toString(num));

        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change(int [] arr){
        arr[0] = 55;
    }
}

// String are immutable in java
// While array are mutable

// here we pass copy of num to the change() with name arr
// change() changes the value of arr[0] = 99
// so it will change original array 
