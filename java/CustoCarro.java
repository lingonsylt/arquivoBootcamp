// Programa calcula valor de um carro, sende este a soma do custo
// de f�brica com a poercentagem de distribui��o e dos impostos.
// Para porcentagem de distribui��o: 28%; para impostos: 45%.
// Programa l� custo de f�brica.

import java.util.Scanner;

public class CustoCarro{
	public static void main (String args[])
	{
		float mkCost, price = 0;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Qual custo de f�brica");
		mkCost = read.nextFloat();

		// retorna valor
		price = price + (mkCost / 100) * 28;
		price = price + (mkCost / 100) * 45;
		price = price + mkCost;

		System.out.print("O valor do carro � de: R$" + price);
	}
}
