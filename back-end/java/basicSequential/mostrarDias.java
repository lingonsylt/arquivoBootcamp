// Programa que lê a idade de uma pessoa expressa em anos,
// meses e dias e a imprime expressa apenas em dias.

import java.util.Scanner;

public class mostrarDias{
	public static void main (String args[])
	{
		int years, months, days, totalDays;
		Scanner get = new Scanner(System.in);

		System.out.print("Anos: ");
		years = get.nextInt();
		System.out.print("meses: ");
		months = get.nextInt();
		System.out.print("dias: ");
		days = get.nextInt();
						
		totalDays = years * 365 + months * 30 + days;

		System.out.printf("Total de dias: %d.\n", totalDays);
	}

}
