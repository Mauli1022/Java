public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    static boolean isHappy(int n) {
        
        if(n < 10){
            if(n == 1 || n == 7) return true;
            else return false;
        }

        return isHappy(calculateSum(n));
    }

    static int calculateSum(int n){
        int sum = 0;
        while(n > 0){
            sum += ((n % 10) * (n % 10));
            n /= 10;
        }
        return sum;
    }
}
