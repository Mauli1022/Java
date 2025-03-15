public class CountPrimes {
    public static void main(String[] args) {
        int n = 10;

        // System.out.println(2 % 2);
        System.out.println(countPrimes(n));
    }

    /* 
    static int countPrimes(int n) {

        int ans = 0;

        for (int i = 2; i < n; i++) {
            int count = 0;
            for (int j = 2; j < n; j++) {
                int temp = i % j ;

                if (temp == 0) {
                    count++;
                }
            }
            if (count < 2) {
                ans++;
            }
        }

        return ans;
    }
        */

    static int countPrimes(int n) {
        if (n <= 2) return 0; 
        
        int ans = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                ans++;
            }
        }

        return ans;
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) { 
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int checkPrime(int n){

        if (n <= 2) return 0; // No prime numbers less than 2
        
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true; // Assume all numbers are prime initially
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Mark all multiples of i as non-prime
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count the number of primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

}
