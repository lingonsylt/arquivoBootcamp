// Program reads numbers and then print the sum of them.

import java.util.Scanner;

public class randomNumber00{
	public static void main (String args[])
	{
		int num, sum = 0;
		Scanner s = new Scanner(System.in);

		do
		{
			System.out.print("Digite um número: ");
			num = s.nextInt();

			sum+= num;
		}
		while(num != 0);

		System.out.printf("A soma dos números digitados é: %d.", sum);
	}
}
