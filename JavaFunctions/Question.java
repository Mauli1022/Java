import java.util.Scanner;

public class Question {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // boolean ans = isPrime(n);
        // System.out.println(ans);

        // boolean ans = isArmstrongorNot(n);
        // System.out.println(ans);

        // Print all 3 digit armstrong number;
        for(int i=100;i<1000;i++){

           if(isArmstrongorNot(i)){
            System.out.print(i + " ");
           }
        }

        sc.close();
    }


    // function to check if given number is armstrong or not 
    static boolean isArmstrongorNot(int n){
        int original = n;
        int sum = 0;

        while (n>0) {
            int rem = n % 10;
            n = n / 10 ;
            sum = sum + rem*rem*rem;
        }

        // if(sum == original){
        //     return true;
        // }
        // return false;
        return sum == original;
    }
    /*
     * ArmStrong Numbers
     
     int a =  153

     cube(1^3 + 5^3 + 3^3) = 1 + 125 + 27 = 153

     */



    // Function to check if Given Number is Prime or not
    static boolean isPrime(int a){
        if(a <= 1){
            return false;
        }

            int c = 2;
            while(c * c <= a){
                if(a % c == 0){
                    return false;
                }
                c++;
            }
            // if(c * c > a){
            //     return true;
            // }
            return c * c > a;
    }
}
