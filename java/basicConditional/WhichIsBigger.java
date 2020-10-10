// Program reads three integers and returns the bigger of them.

import java.util.Scanner;

public class  whichIsBigger{
	public static void main (String args[])
	{
		int int1, int2, int3;
		Scanner get = new Scanner(System.in);
		
		System.out.print("Digite primeiro número: ");
		int1 = get.nextInt();
		System.out.print("Digite segundo número: ");
		int2 = get.nextInt();
		System.out.print("Digite último número: ");
		int3 = get.nextInt();

		if(int1 > int2 && int1 > int3)
		{
			System.out.printf("Maior núemro: %d.", int1);
		}
		else if(int2 > int1 && int2 > int3)
		{
			System.out.printf("Maior núemro: %d.", int2);
		}
		else
		{
			System.out.printf("Maior núemro: %d.", int3);
		}
	}
}
