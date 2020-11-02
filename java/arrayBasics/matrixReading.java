/**
 * Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
 * menu de opções:
 */

import java.util.Scanner;

public class MatrixReading{
    public static void main (String args[]){
        int over10 = 0;
        int[][] matrix = new int[3][3];
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("Atribua um valor para a posição [%d][%d] "+
                                  "da matriz: ", i, j);
                matrix[i][j] = s.nextInt();

                if(matrix[i][j] > 10){
                    over10++;
                }
            }
        }

        System.out.printf("A incidência de valores maiores que 10 é: %d",
                          over10);
    }
}
