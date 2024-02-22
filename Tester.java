import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which algorithm (s for sum, sm for scaler mult, mm for matrix mult): ");
		String alg = input.nextLine();
		
		if (alg.equals("s"))
		{
			System.out.println("Array size: ");
			int n = input.nextInt();
			int[] array = new int[n];
			for (int i = 0; i<n; i++)
				array[i] = (int)(Math.random()*100);
			
			System.out.println(algorithms.arraySum(n, array));
		}
		
		else if(alg.equals("sm"))
		{
			System.out.println("Matrix size: ");
			int n = input.nextInt();
			System.out.println("Constant: ");
			int constant = input.nextInt();
			int[][] matrix = new int[n][n];
			for (int r = 0; r<n; r++)
				for (int c = 0; c<n; c++)
					matrix[r][c] = (int)(Math.random()*100);
			
			int[][] result = algorithms.scalarMatMult(n, matrix, constant);
			
			for (int r = 0; r<n; r++)
				for (int c = 0; c<n; c++)
					System.out.print(result[r][c] + ", ");
		}
		
		else if(alg.equals("mm"))
		{
			System.out.println("Matrix size: ");
			int n = input.nextInt();
			int[][] m1 = new int[n][n];
			int[][] m2 = new int[n][n];
			
			for (int r = 0; r<n; r++)
				for (int c = 0; c<n; c++)
				{
					m1[r][c] = (int)(Math.random()*100);
					m2[r][c] = (int)(Math.random()*100);
				}
			
			int[][] result = algorithms.matrixMult(n, m1, m2);
			
			for (int r = 0; r<n; r++)
				for (int c = 0; c<n; c++)
					System.out.print(result[r][c] + ", ");
		}
	}

}
