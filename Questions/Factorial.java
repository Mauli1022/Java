import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        // int num = sc.nextInt();
        int num = 4;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            
            fact *= i;
            
            // System.out.println(num);
        }
        System.out.println(fact);
        
    }
}
/*
  
  num = 4

  fact = 1*2*3*4
 
 */
