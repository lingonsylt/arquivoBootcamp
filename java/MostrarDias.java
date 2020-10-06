// Programa que lê a idade de uma pessoa expressa em anos,
// meses e dias e a imprime expressa apenas em dias.

import java.util.Scanner;

public class MostrarDias{
	public static void main (String args[])
	{
		int years, months, days, totalDays;
		Scanner read = new Scanner(System.in);

		System.out.print("Digite sua idade em ano, meses e dias.");
		System.out.print("Anos:");
		years = read.nextInt();
		System.out.print("meses:");
		months = read.nextInt();
		System.out.print("dias:");
		days = read.nextInt();
						
		totalDays = (years * 365) + (months * 30) + days;

		System.out.print("O total de dias que você viveu foi de: " + totalDays);
	}

}
