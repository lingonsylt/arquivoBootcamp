// Program reads multiple ages and print the amount of people under 21.
// Program stops readind when -99 is entered as age.

import java.util.Scanner;

public class askAge{
	public static void main (String args[])
	{
		int age = 0, under21 = 0, over50 = 0;
		Scanner get = new Scanner(System.in);
		
		while(age != -99)
		{
			System.out.print("Digite idade: ");
			age = get.nextInt();

			if(age > 0 && age <= 21)
			{
				under21++;
			}

			if(age > 50)
			{
				over50++;
			}
		}

		System.out.print("Abortado\n");
		System.out.printf("O total de pessoas com menos de vinte e um é de %d e o total de pessoas com mais de cinquenta é de %d.", under21, over50);
	}
}
