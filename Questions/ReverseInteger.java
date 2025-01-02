// https://leetcode.com/problems/reverse-integer/description/
public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1534236469;

        System.out.println(reverse(x));
    }

    static int reverse(int x) {
        int num = Math.abs(x); // Original number ka absolute value nikala
        System.out.println( num);

        int rev = 0; // Reversed number

        while (num != 0) {
            int ld = num % 10; // Last digit nikala

            // Overflow check
            if (rev > (Integer.MAX_VALUE - ld) / 10) {
                return 0; // Agar overflow hua, toh 0 return kardo
            }

            rev = rev * 10 + ld; // Reverse mein digit ko add kiya
            num = num / 10; // Last digit hata diya, next iteration ke liye
        }

        return (x < 0) ? (-rev) : rev; // Original number ke sign ke hisaab se result diya
    }

}
