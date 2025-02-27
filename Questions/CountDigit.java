// https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/
public class CountDigit {
    public static void main(String[] args) {
        int num = 128;
        System.out.println(countDigits(num));
    }

    static int countDigits(int num) {
        int count = 0;
        int temp = num;
        while (temp != 0) {
            int n = temp % 10;

            if (num % n == 0) {
                count++;
            }
            temp /= 10;
        }
        return count;
    }
}
