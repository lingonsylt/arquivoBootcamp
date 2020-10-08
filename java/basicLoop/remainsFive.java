// Program returns each number in between 1000-1999 which is divisible by 11
// and has 5 as remainder.

import java.lang.Thread;

public class remainsFive{
	public static void main (String args[])
	{
		int rFive;

		System.out.println("Números:");
		for(int i = 1000; i <= 1999; i++)
		{
			if(i % 11 == 5)
			{
				rFive = i;
				System.out.printf("%d ", rFive);
			}
		}
	}
}
