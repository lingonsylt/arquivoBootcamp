/**
 * Program reads input from the user, creates two [2][2] arrays and prompts
 * the user with a menu:
 * 
 * (1) to sum arrays
 * (2) to subtract the first arrays from the second
 * (3) to sum a constant to both arrays
 * (4) to print the arrays
 *
 * Both 1st and 2nd options must create a third [2][2] array
 * In the 3rd option the constant value is read from the user and the sum is
 * stored in the existing arrays.
 * 
 * Author: Rafael Oliveira
 *
 * Last Update: November 1, 2020 22:49:33
 */

import java.util.Scanner;
import java.util.Arrays;

public class ArraysOptions{
    public static void main (String[] arg){
        int option;
        int[][] matrixOne = new int[2][2];
        int[][] matrixTwo = new int[2][2];
        int[][] matrixSum = new int[2][2];
        int[][] matrixSub = new int[2][2];
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.printf("Atribua um número para a posição %d,%d"+
                                  "da matriz 1: ", i, j);
                matrixOne[i][j] = s.nextInt();
            }
        }

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.printf("Atribua um número para a posição %d,%d"+
                                  "da matriz 2: ", i, j);
                matrixTwo[i][j] = s.nextInt();
            }

            for(int j = 0; j < 2; j++){
                matrixSum[i][j] = matrixOne[i][j] + matrixTwo[i][j];
                matrixSub[i][j] = matrixTwo[i][j] - matrixOne[i][j];
            }
        }

        do{
        System.out.println("\nEscolha uma opção:\n(1) Somar matrizes\n(2) Sub"+
                           "trair primeira matrix da segunda\n(3) Somar uma c"+
                           "onstante às matrizes\n(4) Mostrar matrizes\n(5) F"+
                           "inalizar programa\n");
        option = s.nextInt();

            switch(option){
                case 1:
                    System.out.println(Arrays.deepToString(matrixSum));
                    break;

                case 2:
                    System.out.println(Arrays.deepToString(matrixSub));
                    break;

                case 3:
                    System.out.print("Digite valor da constante: ");
                    int constant = s.nextInt();

                    for(int i = 0; i < 2; i++){
                        for(int j = 0; j < 2; j++){
                            matrixOne[i][j]+= constant;
                        }
                    }
                    System.out.println(Arrays.deepToString(matrixOne));

                    for(int i = 0; i < 2; i++){
                        for(int j = 0; j < 2; j++){
                            matrixTwo[i][j]+= constant;
                        }
                    }
                    System.out.println(Arrays.deepToString(matrixTwo));
                    break;

                case 4:
                    System.out.println(Arrays.deepToString(matrixOne));
                    System.out.println(Arrays.deepToString(matrixTwo));
                    break;

                case 5:
                    option = -1;
                    break;

                default:
                    System.out.println("Escolha uma opção válida");
            }
        }while(option != -1);
    }
}
