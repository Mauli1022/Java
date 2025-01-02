public class Swap {

    static void swapNum(int a, int b){
        int temp = a;
        a = b ;
        b = temp ;
         // this change only be valid in ths function scope only.
    }
    public static void main(String[] args) {
        int a = 5060799;
        int b = 2455645;
        swapNum(a, b);
        System.out.println(a + " " + b);
    }
}
/*
 * Primitivs : Int sort, char ,Byte -> just pass by value
 * 
 * objects : passing value of the ref value,
 */