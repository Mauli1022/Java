public class Pow {

    public static void main(String[] args) {
        double x = 2.1000;
        int n = 3;
        System.out.println(myPow(x, n));
    }
    static double myPow(double x, int n) {

        double ans = 1;

        if(n == 0){
            return 0;
        }
        if (n == 1) {
            return x;
        }

        for(int i=1;i<=n;i++){
            ans = ans * i;
        }

        return ans ;
        
    }
    
}
