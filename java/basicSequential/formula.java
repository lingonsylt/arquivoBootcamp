/*
 * Program reads three integers A, B and C and then calculates the following:
 * D = (R + S) / 2. Being R = (A + B)², and S = (B + C)²
 */

import java.util.Scanner;

public class formula{
	public static void main (String args[])
	{
		double a, b, c, r, s, d;
		Scanner get = new Scanner(System.in);
		
		System.out.print("Digite um núemro: ");
		a = get.nextInt();
		System.out.print("Digite um núemro: ");
		b = get.nextInt();
		System.out.print("Digite um núemro: ");
		c = get.nextInt();
		
		r = Math.pow(a, 2) + (2 * (a * b)) + Math.pow(b, 2);
		s = Math.pow(b, 2) + (2 * (b * c)) + Math.pow(c, 2);
		d = (r + s) / 2;
		
		System.out.printf("Na expressão D=(R+S)/2, onde R=(A=B)² e S=(B+C)², o valor de D é %5.2f ", d);
	}
}
