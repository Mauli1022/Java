public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(palindrome(num));
        for (int i = 10; i < 100; i++) {
            // boolean isPalindrome = palindrome(i);
          if (palindrome(i)) {
            System.out.println(i);
          }
        }
        // System.out.println(1%10);
        // System.out.println(1 / 10);
    }
    static boolean palindrome(int num){
        int reverse = 0;
        int temp = num;
        // System.out.println("Temp "+temp);
        while (temp != 0) {

            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == num );

    }
}
