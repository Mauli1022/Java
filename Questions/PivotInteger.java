// https://leetcode.com/problems/find-the-pivot-integer/submissions/1521820943/?envType=problem-list-v2&envId=prefix-sum

public class PivotInteger {
    
    public static void main(String[] args) {
        int n = 8;

        System.out.println(pivotInteger(n));
        
    }
    static int pivotInteger(int n) {

        int sum = (( n + 1 ) * n) / 2 ;
        int temp = 0;

        for (int i = 1; i <= n; i++) {

            temp = temp + i;
            if (sum == temp) {
                return i;
            }
            sum = sum - i; 
        }
        return -1;

    }
}
