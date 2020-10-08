// Program reads input as a survey and returns various crossed data
// from a pool of 150 people.

import java.util.Scanner;

public class Survey{
	public static void main (String args[])
	{
		int age = 0, gender = 0, temper = 0, calmPerson = 0, angryWomen = 0, agressiveMen = 0, calmNonBinary = 0, angryOver40 = 0, calmUnder18 = 0, subjects = 1;
		Scanner s = new Scanner(System.in);
		
		while(subjects <= 150)
		{
			System.out.printf("\nPessoa número %d.\n", subjects);
			
			do
			{
			System.out.print("Idade: ");
			age = s.nextInt();
				if(age < 1)
				{
					System.out.print("\nErro! Responda de novo!\n");
				}
			}
			while(age < 1);
	
			do
			{
			System.out.print("\nGênero:\n");
			System.out.print("[1] - Mulher\n[2] - Homem\n[3] - Não-binárie\n");
			gender = s.nextInt();
				if(gender < 1 || gender > 3)
				{
					System.out.printf("\nErro! Responda de novo!");
				}
			}
			while(gender < 1 || gender > 3);

			do
			{
			System.out.print("\nPersonalidade:\n");
			System.out.print("[1] - Calmx\n[2] - Nervosx\n[3] - Agressivx\n");
			temper = s.nextInt();
				if(temper < 1 || temper > 3)
				{
					System.out.printf("\nErro! Responda de novo!");
				}

				if(temper == 1)
				{
					calmPerson++;
				}

				if(temper == 1 && gender == 3)
				{
					calmNonBinary++;
				}
				else if(temper == 1 && age < 18)
				{
					calmUnder18++;
				}

				if(temper == 2 && gender == 1)
				{
					angryWomen++;
				}
				else if(temper == 2 && age > 40)
				{
					angryOver40++;
				}

				if(temper == 3)
				{
					agressiveMen++;
				}
			}
			while(temper < 1 || temper > 3);
			
			subjects++;
		}
		
		System.out.printf("Número de pessoas calmas: %d\n", calmPerson);
		System.out.printf("Número de mulheres nervosas: %d\n", angryWomen);
		System.out.printf("Número de homens agressivos: %d\n", agressiveMen);
		System.out.printf("Número de não-bináries calmes: %d\n", calmNonBinary);
		System.out.printf("Número de nervosos com mais de 40 anos: %d\n", angryOver40);
		System.out.printf("Número de calmos com menos de 18 anos: %d\n", calmUnder18);
	}
}
