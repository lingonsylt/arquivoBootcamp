/**
 * Program reads 6 integers and then prints out: the even numbers and
 * the sum of them, the odd numbers and how many of them are there.
 *
 * Author: Rafael Oliveira.
 *
 * Last update: November 1, 2020 21:56:14
 */

import java.util.Scanner;

public class EvenOddArray{
    public static void main (String[] args){
        int
        odd = 0,
        even = 0;
        int[] integers = new int[6];
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 6; i++){
            System.out.print("Digite um número: ");
            integers[i] = s.nextInt();

            int checker = (integers[i] % 2 == 0) ? even+= integers[i] : odd++;
        }

        System.out.print("Lista dos números pares:\n");
        for(int integer: integers){
            if(integer % 2 == 0){
                System.out.printf("%d ", integer);
            }
        }
        System.out.printf("\nA soma dos números pares é: %d\n", even);

        System.out.print("Lista dos números ímpares:\n");
        for(int integer: integers){
            if(integer % 2 == 1){
                System.out.printf("%d ", integer);
            }
        }
        System.out.printf("\nA quantidade de números ímpares é: %d", odd);

    }
}
