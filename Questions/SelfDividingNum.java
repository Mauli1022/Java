// https://leetcode.com/problems/self-dividing-numbers/

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNum {
    public static void main(String[] args) {
        int left = 1;
        int right = 22;

        System.out.println(selfDividingNumbers(left,right));
    }

    static List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> ans = new ArrayList<>();

        for (int i = left; i <= right; i++) {

            if (checkDigitCountInNum(i)) {
                ans.add(i);
            }

        }
        return ans;
    }

    static boolean checkDigitCountInNum(int n){

        int digitCount = 0;
        int digitTemp = n;
        while (digitTemp != 0) {
            digitTemp = digitTemp / 10;
            digitCount++;
        }

        // check give number is divisible by itself
        int count = 0;
        int temp = n;
        while (temp != 0) {

            int n1 = temp % 10;

            if (n1 == 0 || n % n1 != 0) {  
                return false;
            }
            count++;
            temp /= 10;
            
        }

        return count == digitCount;
    }
}
