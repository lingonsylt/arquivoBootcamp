public class MultActionArray{
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
