// import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedMaterix {
    public static void main(String[] args) {

        int [][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(arr, 16)));

    }

    static int[] search(int[][] materix, int target) {
        int rows = materix.length;
        int cols = materix[0].length;
        // be cautionus, materix may be empty
        if (rows == 1) {
            return binarySearch(materix, 0, 0, cols - 1, target);
        }
        // run the loop till 2 rows are remaining
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;

            if (materix[mid][cMid] == target) {
                return new int[] { mid, cMid };
            } else if (materix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        // new we have 2 rows
        // check whether the target is in the col of 2 rows
        if (materix[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        if (materix[rStart + 1][cMid] == target) {
            return new int[] { rStart, cMid };
        }

        // Search in 1st half
        if(target <= materix[rStart][cMid-1] ){
            return binarySearch(materix, rStart,0,cMid-1, target);
        }
        // Search in 2nd half
        if(target >= materix[rStart][cMid+1] && target <= materix[rStart][cols-1] ){
            return binarySearch(materix, rStart,cMid,cols-1, target);
        }
        // Search in 3rd half
        if(target <= materix[rStart+1][cMid-1] ){
            return binarySearch(materix, rStart+1,0,cMid-1, target);
        }else{
            // Search in 4th half
            return binarySearch(materix, rStart,cMid+1,cols-1, target);
        }



        // return new int[] { -1, -1 };
    }

    // search in the row provided between the column provided
    static int[] binarySearch(int[][] array, int row, int colStart, int colEnd, int target) {
        while (colStart < colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;

            if (array[row][mid] == target) {
                return new int[] { row, mid };
            } else if (array[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }

        }
        return new int[] { -1, -1 };
    }

}
