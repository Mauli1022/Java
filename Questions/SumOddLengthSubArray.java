// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/description/?envType=problem-list-v2&envId=prefix-sum
import java.util.Arrays;

public class SumOddLengthSubArray {
    public static void main(String[] args) {

        int [] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
        // System.out.println(arr.length / 2 == 0);

        // System.out.println(2%2);
        // System.out.println(1-0+1);
    }

    static int sumOddLengthSubarrays(int[] arr) {

        int sum  = 0;
        int n = arr.length;

        for(int i=0;i<n;i++){

            for(int j=i;j<n;j++){

                if((j-i+1) % 2 == 1){
                    for( int k = i; k<=j;k++){
                        sum += arr[k];
                    }
                }
            }
        }
        
        return sum;
    }
}