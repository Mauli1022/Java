// https://leetcode.com/problems/power-of-three/description/?envType=problem-list-v2&envId=recursion
public class PowOfThree {
    public static void main(String[] args) {
        int n = 9;

        System.out.println(isPowerOfThree(n));
        // System.out.println(Math.pow(3,27));
    }


    static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        
        while (n % 3 == 0) {
            n /= 3;
        }
    
        return n == 1;
    }

     /* 
    static boolean isPowerOfThree(int n) {

    if(n <= 0)return false;
        return 1162261467 % n == 0;
    }
     */
}
