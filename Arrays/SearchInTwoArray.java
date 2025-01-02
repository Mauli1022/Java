import java.util.Arrays;

public class SearchInTwoArray {
    public static void main(String[] args) {

        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6, 459, 76 },
                { 7, 8, 999, 90, 99 }
        };

        // int [] ans = searchItem(arr, 90);
        // System.out.println(Arrays.toString(ans));

        System.out.println("Maximum Value "+maxInTwoDArray(arr));
        System.out.println("Minium Value "+minInTwoDArray(arr));
    }

    static int[] searchItem(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == target)
                    return new int[] { i, j };
            }

        }

        return new int[] { -1, -1 };
    }

    static int maxInTwoDArray(int[][] arr) {

        int maxNum = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (maxNum < arr[i][j]) {
                    maxNum = arr[i][j];
                }
            }

        }

        return maxNum;
    }

    static int minInTwoDArray(int[][] arr) {

        int min = Integer.MAX_VALUE;

        for (int[] i : arr) {
            for (int j : i) {
                if (j < min) {
                    min = j;
                    // return new int[]{i,j};
                }
            }
        }
        // return new int[]{Integer.MIN_VALUE};
        // return new int[]{i,j};
        return min;
    }
}
