// Program reads one's age and returns their category.
// 10-14 infant
// 15-17 juvenile
// 18-25 adult

import java.util.Scanner;

public class WhichCategory{
	public static void main (String arg[])
	{
		int age;
		Scanner get = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		age = get.nextInt();

		if(age >= 10 && age <= 14)
		{
			System.out.print("Sua categoria é infantil");
		}
		else if(age >= 15 && age <= 17)
		{
			System.out.print("Sua categoria é juvenil");
		}
		else if(age >= 18 && age <= 25)
		{
			System.out.print("Sua categoria é adulto");
		}
		else
		{
			System.out.print("VOcê não se encaixa em nenhuma categoria.");
		}
	}
}
