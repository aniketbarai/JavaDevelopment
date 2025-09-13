public class aritmaeticOp2Darray {
    public static void main(String[] args) {
        int[][] a = { { 10, 20 }, { 30, 40 } };
        int[][] b = { { 2, 4 }, { 5, 8 } };
        int rows = a.length;
        int cols = a[0].length;
        int[][] sum = new int[rows][cols];
        int[][] diff = new int[rows][cols];
        int[][] prod = new int[rows][cols];
        int[][] div = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                diff[i][j] = a[i][j] - b[i][j];
                prod[i][j] = a[i][j] * b[i][j];
                div[i][j] = a[i][j] / b[i][j];
            }
        }
        System.out.println("Additon");
        showMatrix(sum);
        System.out.println("Subtraction");
        showMatrix(diff);
        System.out.println("Product");
        showMatrix(prod);
        System.out.println("Division");
        showMatrix(div);


        
        // int[][] matrix = new int[][] {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 },
        // };
        // int rows = matrix.length;
        // int cols = matrix[0].length;
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }
    }

    static void showMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) {
                System.out.print(val + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
