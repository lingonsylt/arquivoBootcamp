// Program reads multiple ages and print the amount of people under 21.
// Program stops readind when -99 is entered as age.

import java.util.Scanner;

public class askAge{
	public static void main (String args[])
	{
		int age = 0, under21 = 0;
		Scanner get = new Scanner(System.in);
		
		while(age != -99)
		{
			System.out.printf("Pessoas com menos de 21 anos: %d.\n", under21);

			System.out.print("Digite sua idade: ");
			age = get.nextInt();

			if(age > 0 && age <= 21)
			{
				under21++;
			}
			
			clearScreen();
		}

		System.out.print("Abortado");
	}

	public static void clearScreen()
	{
	    System.out.flush();
	}
}
