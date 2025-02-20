public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        
        for (int i = 10; i < 100; i++) {
          if (palindrome(i)) {
            System.out.println(i);
          }
        }
       
    }
    static boolean palindrome(int num){
        int reverse = 0;
        int temp = num;

        while (temp != 0) {

            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == num );
    }
}
