import java.util.Scanner;

public class matrixOptions{
	public static void main (String argg[])
	{
		float[][] matrixOne = new float[2][2];
		float[][] matrixTwo = new float[2][2];
		float[][] matrixSum = new float[2][2];
		float[][] matrixSub = new float[2][2];
		Scanner s = new Scanner(System.in);

		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.printf("Atribua um número para a posição [%d][%d] da matriz 1: ", i, j);
				matrixOne[i][j] = s.nextFloat();                                        
			}                                                                               
		}
		System.out.println();
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)                                                      
			{                                                                               
				System.out.printf("Atribua um número para a posição [%d][%d] da matriz 2: ", i, j);
				matrixOne[i][j] = s.nextFloat();
			}
		}
	/*
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)                                                      
			{
				matrixSum[i][j] = matrixOne[i][j] + matrixTwo[i][j];
				matrixSub[i][j] = matrixOne[i][j] - matrixTwo[i][j];
			}
		}
	*/
		System.out.println();
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)                                                      
			{                                                                               
				System.out.printf("%f, ", matrixOne[i][j] + matrixTwo[i][j]));
			}
		}

		System.out.println();
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)                                                      
			{                                                                               
				System.out.printf("%f, ", matrixSub[i][j]);
			}
		}
	}
}
