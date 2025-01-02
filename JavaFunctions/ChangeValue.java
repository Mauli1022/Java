// import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args){
        // creating an array
        int[] myArr = {1,2,3,4,5,6};
        change(myArr);
        System.out.println(Arrays.toString(myArr));
    }

    static void change(int [] nums){
        nums[0] = 99;//if you make a change to this object via this ref variable ,same object will be change
    }
}
