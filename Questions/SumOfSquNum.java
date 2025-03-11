public class SumOfSquNum {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(judgeSquareSum(n));
        // judgeSquareSum(n);
    }

    static boolean judgeSquareSum(int c) {

        int s = 0;
        int e = (int) Math.sqrt(c);

        while (s <= e) {
            long sum = (long) s * s + (long) e * e;

            if (sum == c) {
                return true;
            }
            if (sum < c) {
                s++;
            } else {
                e--;
            }
        }
        return false;
    }
}
