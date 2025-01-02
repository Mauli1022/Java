import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // variable length arguments
        // fun(1,2,3,4,5,6,7,99);
        // multiple(1100, 29930, "Aman","Rohan","Krishna","naman" );

        // demo();
    }
    // here it will take variable length or arguments

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    // mixed arguments
    static void multiple(int a, int b, String ...v){
        System.out.println(a+" "+b+" "+Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
