/*
 * Program reads three scores and calculates the weighted average score.
 * The weight factor is: 2, 3 and 5 respectively
 */

import java.util.Scanner;

public class average{
	public static void main (String args[])
	{
		float score1, score2, score3, wAverage;
		Scanner s = new Scanner(System.in);

		System.out.print("Digite nota da 1ª prova: ");
		score1 = s.nextInt();
		System.out.print("Digite nota da 2ª prova: ");
		score2 = s.nextInt();
		System.out.print("Digite nota da 3ª prova: ");
		score3 = s.nextInt();

		score1*= 2;
		score2*= 3;
		score3*= 5;
		wAverage = (score1 + score2 + score3) / 10;

		System.out.printf("A média ponderada é de %2.1f", wAverage);
		
	}
}
