public class CheckIfDubleExist {
    public static void main(String[] args) {
        int [] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
    static boolean checkIfExist(int[] arr) {

        for(int i=0;i<arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                if (j == i) continue;
                long dubleNum = 2 * arr[j];

                if (dubleNum == arr[i]) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
