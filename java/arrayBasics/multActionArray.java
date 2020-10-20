/*
* Faça um programa que possua um vetor denominado A que armazene 6 números
* inteiros. O programa deve executar os seguintes passos:
* (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
* (b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
* A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
* (c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
* (d) Mostre na tela cada valor do vetor A, um em cada linha.
*/
public class multActionArray{
	public static void main (String args[])
	{
		int container = 0;
		int[] a = {1, 0, 5, -2, -5, 7};

		for(int i = 0; i < 6; i++)
		{
			if(i == 0 || i == 1 || i == 5)
			{
				container+= a[i];
			}

			if(i == 4)
			{
				a[i] = 100;
			}
		}

		System.out.printf("Soma das posições 0, 1 e 5: %d\n", container);
		System.out.printf("Valores do vetor A:\n");
		for(int i : a)
		{
			System.out.println(i);
		}
	}
}
