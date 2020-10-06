// Programa que lê a idade de uma pessoa expressa em
// dias e a imprime expressa em anos, meses e dias.

import java.util.Scanner;

public class MostrarAnos{
	public static void main (String args[])
	{
		int years, months, days, totalDays;
		Scanner read = new Scanner(System.in);

		System.out.print("Digite sua idade em dias:");
		totalDays = read.nextInt();

		years = totalDays / 365;
		months = (totalDays % 365) / 30;
		days = (totalDays % 365) % 30;

		System.out.print("Sua idade é de " + years + " anos, " + " meses e " + days + " dias.");
	}

}
