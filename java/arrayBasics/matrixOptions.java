/*
*
* STILL TODO!
*
* Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
* menu de opções:
* (1) somar as duas matrizes
* (2) subtrair a primeira matriz da segunda
* (3) adicionar uma constante as duas matrizes
* (4) imprimir as matrizes
* Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
* da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
* própria matriz.
*
*/

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
