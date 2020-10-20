/*
 * Program reads 6 integers and then prints out: the even numbers and
 * the  sum of them. The odd numbers and the sum of them.
 */

import java.util.Scanner;

public class evenOddArray{
	public static void main (String args[])
	{
		int[] integers = new int[6];
		int even = 0, odd = 0;
		Scanner s = new Scanner(System.in);

		for(int i = 0; i < 6; i++)
		{
			System.out.print("Digite um número: ");
			integers[i] = s.nextInt();

			if(integers[i] % 2 == 0)
			{
				even+= integers[i];
			}
			else
			{
				odd++;
			}
		}
		
		System.out.print("Lista dos números pares:\n");
		for(int i = 0; i < 6; i++)
		{
			if(integers[i] % 2 == 0)
			{
				System.out.printf("%d ", integers[i]);
			}
		}
		System.out.printf("\nA soma dos números pares é: %d\n", even);

		System.out.print("Lista dos números ímpares:\n");
		for(int i = 0; i < 6; i++)
		{
			if(integers[i] % 2 == 1)
			{
				System.out.printf("%d ", integers[i]);
			}
		}
		System.out.printf("\nA quantidade de números ímpares é: %d", odd);

	}
}
