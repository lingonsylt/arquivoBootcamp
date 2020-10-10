// Program reads number and then print the average of those multiples of 3.

import java.util.Scanner;

public class randomMultiples3{
	public static void main (String args[])
	{
		int i, dividend = 0, divisor = 0;
		Scanner s = new Scanner(System.in);

		do
		{
			System.out.print("Digite um número: ");
			num = s.nextInt();

			
			if(i % 3 == 0 && i != 0)
			{
				dividend+= i;
				divisor++;
			}
		}
		while(num != 0);

		System.out.printf("Média dos números múltiplos de três: %d.", dividend / divisor);
	}
}
