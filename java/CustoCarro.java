// Programa calcula valor de um carro, sende este a soma do custo
// de fábrica com a poercentagem de distribuição e dos impostos.
// Para porcentagem de distribuição: 28%; para impostos: 45%.
// Programa lê custo de fábrica.

import java.util.Scanner;

public class CustoCarro{
	public static void main (String args[])
	{
		float mkCost, price = 0;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Qual custo de fábrica");
		mkCost = read.nextFloat();

		price = price + (mkCost / 100) * 28;
		price = price + (mkCost / 100) * 45;
		price = price + mkCost;

		System.out.print("O valor do carro é de: R$" + price);
	}
}
