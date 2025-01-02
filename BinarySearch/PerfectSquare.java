// https://leetcode.com/problems/valid-perfect-square/?envType=problem-list-v2&envId=binary-search
public class PerfectSquare{
    public static void main(String[] args) {
        int num = 9;
        
        System.out.println(isPerfectSquare(num));
    }

    static boolean isPerfectSquare(int num) {

        int start = 0;
        int end = num;

        while(start <= end){

            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if(square < num){
                start = mid + 1;
            }else if(square > num){
               end = mid-1 ;
            }else if(square == num){
                return true;
            }
        }
        return false;
        
    }
}