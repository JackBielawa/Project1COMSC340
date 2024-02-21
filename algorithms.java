public class algorithms {

    /**
     * Calculates the sum of the first n numbers in an array.
     * 
     * @param n The number of elements to sum in the array.
     * @param array The array of numbers.
     * @return The sum of the first n numbers.
     */
    public static double arraySum(int n, double[] array) {
        double result = 0;
        for (int i = 0; i < n; i++) {
            result += array[i];
        }
        return result;
    }

    /**
     * Performs scalar multiplication on an n by n matrix.
     * 
     * @param n The dimension of the matrix.
     * @param matrix The matrix to be multiplied.
     * @param constant The scalar value for multiplication.
     * @return The resultant matrix after scalar multiplication.
     */
    public static int[][] scalarMatMult(int n, int[][] matrix, int constant) {
        int[][] result = new int[n][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                result[r][c] = matrix[r][c] * constant;
            }
        }
        return result;
    }

    /**
     * Multiplies two n by n matrices.
     * 
     * @param n The dimension of the matrices.
     * @param m1 The first matrix.
     * @param m2 The second matrix.
     * @return The product of the two matrices.
     */
    public static int[][] matrixMult(int n, int[][] m1, int[][] m2) {
        int[][] result = new int[n][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                for (int k = 0; k < n; k++) {
                    result[r][c] += m1[r][k] * m2[k][c];
                }
            }
        }
        return result;
    }
}
