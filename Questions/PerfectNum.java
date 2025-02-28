public class PerfectNum {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(checkPerfectNumber(n));
    }

    static boolean checkPerfectNumber(int num) {
        
        int sum = 0;

        for(int i=1;i<=num/2;i++){

            if (num % i == 0) {
                sum = sum + i;
            }
        }

        return sum == num;
    }
}
