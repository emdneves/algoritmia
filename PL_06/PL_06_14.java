/* 14. Implemente funções que, dadas 2 matrizes de inteiros com a mesma dimensão bem como a sua dimensão, apresente (numa função) 
em forma de matriz o resultado da soma das 2 matrizes e (noutra função) o somatório dos seus elementos. */

import java.util.Scanner;
import java.util.Random;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); /* intitalizing scanner */

        System.out.println("Enter size");
        int size = input.nextInt();
        input.close(); /* closing the scanner */

        int[][] matriz1 = new int[size][size];
        int[][] matriz2 = new int[size][size];
        int col = 0, row = 0;
        // duas matrizes
        for (row = 0; row < size; row++) {
            for (col = 0; col < size; col++) {
                Random rand = new Random();
                int n = rand.nextInt(10);
                int m = rand.nextInt(10);
                matriz1[row][col] = n;
                matriz2[row][col] = m;
            }
        }

        // imprimir a matriz 1
        for (row = 0; row < size; row++) {
            for (col = 0; col < size; col++) {
                System.out.print(matriz1[row][col]);
            }
            System.out.println();
        }
        System.out.println("-----");

        // imprimir a matriz 2

        for (row = 0; row < size; row++) {
            for (col = 0; col < size; col++) {
                System.out.print(matriz2[row][col]);
            }
            System.out.println();
        }
    }
}
