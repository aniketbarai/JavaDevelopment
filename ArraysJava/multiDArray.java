import java.util.Scanner;

public class multiDArray {
    public static void main(String[] args) {
        /*
         * > 2D array is like a matrix.
         * > An array of arrays.
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */

        // int[][] arr = new int[3][3];
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // int[][] arr = new int[3][];
        int[][] indArr = {
                // individual size of array can be vary.
                { 1, 2, 3 }, // 0th index
                { 4, 5 }, // 1st index
                { 7, 8, 9, 6 }// 2nd index
        };
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < indArr.length; i++) {
            for (int j = 0; j < indArr[i].length; j++) {
                System.out.print(indArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
