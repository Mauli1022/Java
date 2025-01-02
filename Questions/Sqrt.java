public class Sqrt {

    public static void main(String[] args) {
        int x = 18;
        // System.out.println(binarySearchSqrt(x));
        loop();
    }

    static int sqrt(int x) {
        int ans = 0;
        if (x == 1) {
            return 1;
        }
        for (int i = 1; i < x; i++) {
            if (i * i <= x) {
                ans = i;
            }
        }
        return ans;
    }

    static int binarySearchSqrt(int x) {
        int start = 0;
        int end = x;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            // long square = (long) mid * mid ;

            if ((long) mid * mid > x) {
                end = mid - 1;
            } else if (mid * mid < x) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return end;
        /*
         * int start = 0;
         * int end = x;
         * 
         * while (start <= end) {
         * int mid = start + (end - start) / 2;
         * long square = (long) mid * mid;
         * 
         * if (square < x) {
         * start = mid + 1;
         * } else if (square > x) {
         * end = mid - 1;
         * } else {
         * return mid;
         * }
         * }
         * return end;
         */
    }

    static void loop(){
        int i = 0;
        int j = 0;
        while (i<5) {
            System.out.println(i+" ");
            i++;
        }
        System.out.println();
        while (j<=5) {
            System.out.println(j +" ");
            j++;
        }
    }
}