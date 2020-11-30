/*
* Program reads three integers and returns them sorted from the smaller
* to the bigger. NOTE: this is not the most efficient way, it severs 
* practice purposes only.
*/

import java.util.Scanner;

public class  ascendingOrder{
	public static void main (String args[])
	{
		int int1, int2, int3, first = 0, second = 0, third = 0;
		Scanner get = new Scanner(System.in);
		
		System.out.print("Digite primeiro número: ");
		int1 = get.nextInt();
		System.out.print("Digite segundo número: ");
		int2 = get.nextInt();
		System.out.print("Digite último número: ");
		int3 = get.nextInt();
		
		if(int1 > int2)
		{
			if(int2 > int3)
			{
				first = int3;
				second = int2;
				third = int1;
			}
			else if(int3 < int1)
			{
				first = int2;
				second = int3;
				third = int1;
			}
		}
			
		if(int2 > int3)
		{
			if(int3 < int1)
			{
				first = int3;
				second = int1;
				third = int2;
			}
			else if(int1 < int2)
			{
				first = int1;
				second = int3;
				third = int2;
			}
		}
	
		if(int3 > int1)
		{
			if(int1 < int2)
			{
				first = int1;
				second = int2;
				third = int3;
			}
			else if(int2 < int3)
			{
				first = int2;
				second = int1;
				third = int3;
			}
		}
	
		System.out.printf("Números em orderm crescente: %d, %d e %d.", first, second, third);

	}
}
