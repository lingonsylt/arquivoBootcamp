// Programa que lê o tempo de duração de um evento em uma fábrica expresso
// em segundos e o mostra expresso em horas, minutos e segundos.

import java.util.Scanner;

public class Tempo{
	public static void main (String args[])
	{
		int hours, minutes, seconds, totalSeconds;
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite tempo de evento: ");
		totalSeconds = read.nextInt();
		
		hours = totalSeconds / 3600;
		minutes = (totalSeconds % 3600) / 60;
		seconds = (totalSeconds % 3600) % 60;

		System.out.print("O evento dura: " + hours + ":" + minutes + ":" + seconds + ".");
	}
}
