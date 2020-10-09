import java.util.Scanner;

public class EvenOddArray{
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

			if(integers[i] % 2 == 1)
			{
				odd+= integers[i];
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
		System.out.printf("\nA soma dos número pares é: %d\n", even);

		System.out.print("Lista dos números ímpares:\n");
		for(int i = 0; i < 6; i++)
		{
			if(integers[i] % 2 == 1)
			{
				System.out.printf("%d ", integers[i]);
			}
		}
		System.out.printf("\nA soma dos número ímpares é: %d", odd);

	}
}
