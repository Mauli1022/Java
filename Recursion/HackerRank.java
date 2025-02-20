import java.util.Scanner;
public class HackerRank {
    public static void main(String[] args) {
        // int n = 2;
        // for (int i = 1; i <= 10; i++) {

        //     System.out.println(n + " x " + i + " = " + n*i);
            
        // }

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();


        System.out.println("String : " + s);
        System.out.println("Double : " + d);
        System.out.println("Integer : " + i);

        sc.close();
    }
}
