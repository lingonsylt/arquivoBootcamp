// Program reads 10 and prints how many of them are even and odd.

import java.util.Scanner;

public class evenOdd{
	public static void main (String arg[])
	{
		int num, even = 0, odd = 0;
		Scanner get = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print("Digite um número: ");
			num = get.nextInt();
			if(num % 2 == 0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}

		System.out.printf("Quantidade de números pares é de %d; de ímpares é de %d.", even, odd);
	}
}
