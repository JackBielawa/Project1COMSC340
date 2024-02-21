import java.util.Random;

public class Tester {

    private static final Random random = new Random();

    public static void main(String[] args) {
        // Define input sizes for testing
        int[] inputSizes = new int[]{10, 100, 200, 500, 1000};
        
        for (int size : inputSizes) {
            System.out.println("Testing with input size: " + size);
            
            // Test arraySum
            double[] array = new double[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextDouble() * 100; // Generate random doubles between 0 and 100
            }
            long start = System.nanoTime();
            double sum = algorithms.arraySum(size, array);
            long end = System.nanoTime();
            System.out.println("Sum of array elements: " + sum + ", Time taken: " + (end - start) + " ns");
            
            // Test scalarMatMult
            int[][] matrix = generateRandomMatrix(size, 10); // Generate random matrix with values up to 10
            start = System.nanoTime();
            int[][] scaledMatrix = algorithms.scalarMatMult(size, matrix, 3); // Scale matrix by a constant factor of 3
            end = System.nanoTime();
            System.out.println("Scalar matrix multiplication, Time taken: " + (end - start) + " ns");
            
            // Test matrixMult
            int[][] matrix2 = generateRandomMatrix(size, 10); // Second matrix for multiplication
            start = System.nanoTime();
            int[][] productMatrix = algorithms.matrixMult(size, matrix, matrix2);
            end = System.nanoTime();
            System.out.println("Matrix multiplication, Time taken: " + (end - start) + " ns");
            
            System.out.println(); // Add a newline for readability between tests
        }
    }

    // Helper method to generate a random matrix of integers
    private static int[][] generateRandomMatrix(int size, int maxValue) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(maxValue + 1); // Generate values between 0 and maxValue
            }
        }
        return matrix;
    }
}