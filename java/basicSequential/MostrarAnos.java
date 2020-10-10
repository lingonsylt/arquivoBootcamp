// Programa que lê a idade de uma pessoa expressa em
// dias e a imprime expressa em anos, meses e dias.

import java.util.Scanner;

public class mostrarAnos{
	public static void main (String args[])
	{
		int years, months, days, totalDays;
		Scanner get = new Scanner(System.in);

		System.out.print("Digite sua idade em dias: ");
		totalDays = get.nextInt();

		years = totalDays / 365;
		months = (totalDays % 365) / 30;
		days = (totalDays % 365) % 30;

		System.out.printf("Sua idade é de %d anos, %d meses e %d dias.\n", years, months, days);
	}

}
