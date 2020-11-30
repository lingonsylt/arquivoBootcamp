// Programa calcula valor de um carro, sende este a soma do custo
// de fábrica com a poercentagem de distribuição e dos impostos.
// Para porcentagem de distribuição: 28%; para impostos: 45%.
// Programa lê custo de fábrica.

import java.util.Scanner;

public class custoCarro{
	public static void main (String args[])
	{
		float mkCost, price = 0;
		Scanner get = new Scanner(System.in);
		
		System.out.print("Custo de fábrica: ");
		mkCost = get.nextFloat();

		price+= (mkCost / 100) * 28;
		price+= (mkCost / 100) * 45;
		price+= mkCost;

		System.out.printf("O valor do carro é de: R$%f.\n", price);
	}
}
