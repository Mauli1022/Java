import java.util.Arrays;

public class Introduction {
    public static void main(String[] args) {
        int [][] materix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        // int[] ans = search(materix, 29);
        System.out.println(Arrays.toString(search(materix, 29)));
    }
    static int [] search(int [][] matrix, int target){
        int row = 0;
        int col = matrix.length-1;
        System.out.println(matrix.length);

        while (row < matrix.length && col >= 0) {

            if(matrix[row][col] == target){
                return new int[]{row,col};
            }else if(matrix[row][col] < target){
                row++;
            }else{
                col--;
            } 
        }
        return new int[]{-1,-1};

    }
}
/*
 * Searching in 2D Array : 
   Q Materix is sorted in row and column wisw

   10, 20, 30, 40
   15, 25, 35, 45
   28, 29, 37, 49
   33, 34, 38, 50
 
 */
