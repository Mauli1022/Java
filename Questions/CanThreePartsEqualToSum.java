// https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/description/
public class CanThreePartsEqualToSum {
    
    public static void main(String[] args) {
        int [] arr = {1,-1,1,-1 };
        System.out.println(canThreePartsEqualSum(arr));;

    }
    static boolean canThreePartsEqualSum(int[] arr) {

        int sum  = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
       
        int target = sum / 3;
       
        if(sum % 3 == 0){

            int currentSum = 0;
            int count = 0;
            
            for (int i = 0; i < arr.length; i++) {
                currentSum += arr[i];
                if (currentSum == target) {
                    currentSum = 0;
                    count += 1;
                }
            }
            if(count == 3){
                return true;
            }
        }
        
        return false;
    }
}
