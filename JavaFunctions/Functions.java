
/**
 * Functions
 */
import java.util.Scanner;

public class Functions {

    static void Sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The Sum = " + sum);

    }

    static int Sum2(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
        // System.out.println("This Will Never Execute");
    }

    static String Greeting(String Name){
        String greeting = "Hello World from " + Name;
        return greeting;
     }

     static int averageNum(int a,int b, int c){
        int avg = a+b+c/3;
        return avg;
     }

    public static void main(String[] args) {
        // Q : Take an input two Number and Print the sum
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        // System.out.println("Enter Number 1");
        // num1 = sc.nextInt();
        // System.out.println("Enter Number 2");
        // num2 = sc.nextInt();

        // int sum = num1 + num2;
        // System.out.println("Sum = "+ sum);
        // Sum(num1, num2);
        // System.out.println("Sum 2 : "+Sum2(num1, num2));


        // Return String 
        // System.out.println(Greeting("Rohan"));
        System.out.println(averageNum(12, 23, 563));


    }

    /*
     * syntax
     * access modifier return type name (){
     * return statement
     * }
     * 
     * 
     * What is call by value and call by refrence
     */
}