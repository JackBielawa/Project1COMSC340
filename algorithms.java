
public class algorithms {
	
	/**
	 * 
	 * @return the sum of the first n numbers in an array
	 */
	public static double arraySum(int n, int[] array)
	{
		long startTime = System.nanoTime();
		double result = 0;
		
		for(int i = 0; i<n; i++)
		{
			result += array[i];
		}
		long endTime = System.nanoTime();
		long duration = endTime = startTime;
		System.out.println("Time taken: " + duration + " nanoseconds");
		
		return result;
	}
	
	/**
	 * @param matrix of size n by n
	 * @return the product of matrix and constant in the form of an n by n matrix
	 */
	public static int[][] scalarMatMult(int n, int[][] matrix, int constant)
	{
		long startTime = System.nanoTime();
		
		int[][] result = new int[n][n];
		
		for(int r = 0; r<n; r++)
		{
			for(int c = 0; c<n; c++)
			{
				result[r][c] = matrix[r][c] * constant;
			}
		}
		long endTime = System.nanoTime();
		long duration = endTime = startTime;
		System.out.println("Time taken: " + duration + " nanoseconds");
		
		return result;
	}
	
	/**
	 * 
	 * @return product of 2 n by n matricies in the form of an n by n matrix
	 */
	public static int[][] matrixMult(int n, int[][] m1, int[][] m2)
	{
		long startTime = System.nanoTime();
		
		int[][] result = new int[n][n];
		
		for(int r = 0; r<n; r++) {
			for(int c = 0; c<n; c++) {
				result[r][c] = 0;
				for(int k = 0; k<n; k++){
					result[r][c] = result[r][c] + m1[r][k] * m2[k][c];
				}
			}
		}
		long endTime = System.nanoTime();
		long duration = endTime = startTime;
		System.out.println("Time taken: " + duration + " nanoseconds");
		
		return result;
	}
}
