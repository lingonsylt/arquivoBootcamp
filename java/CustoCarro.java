// Programa calcula valor de um carro, sende este a soma do custo
// de f�brica com a poercentagem de distribui��o e dos impostos.
// Para porcentagem de distribui��o: 28%; para impostos: 45%.
// Programa l� custo de f�brica.

import java.util.Scanner;

public class CustoCarro{
	public static void main (String args[])
	{
		float mkCost, price = 0;
		Scanner get = new Scanner(System.in);
		
		System.out.print("Custo de f�brica: ");
		mkCost = get.nextFloat();

		price+= (mkCost / 100) * 28;
		price+= (mkCost / 100) * 45;
		price+= mkCost;

		System.out.printf("O valor do carro � de: R$%f.\n", price);
	}
}
