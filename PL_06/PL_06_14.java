/* 14. Implemente funções que, dadas 2 matrizes de inteiros com a mesma dimensão bem como a sua dimensão, apresente (numa função) 
em forma de matriz o resultado da soma das 2 matrizes e (noutra função) o somatório dos seus elementos. */

import java.util.Scanner;
import java.util.Random;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); /* initializing scanner */

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
                System.out.print(matriz1[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("-----");

        // imprimir a matriz 2

        for (row = 0; row < size; row++) {
            for (col = 0; col < size; col++) {
                System.out.print(matriz2[row][col] + " ");
            }
            System.out.println();
        }

        int[][] matrizSoma = somaMatrizes(matriz1, matriz2);
        System.out.println("Soma das Matrizes:");
        imprimirMatriz(matrizSoma);

        int somaTotal = somarElementos(matriz1) + somarElementos(matriz2);
        System.out.println("Soma Total dos Elementos: " + somaTotal);
    }

    public static int[][] somaMatrizes(int[][] matriz1, int[][] matriz2) {
        int size = matriz1.length;
        int[][] matrizSoma = new int[size][size];
        int col = 0, row = 0;

        for (row = 0; row < size; row++) {
            for (col = 0; col < size; col++) {
                matrizSoma[row][col] = matriz1[row][col] + matriz2[row][col];
            }
        }

        return matrizSoma;
    }

    public static int somarElementos(int[][] matriz) {
        int somaTotal = 0;
        int col = 0, row = 0;

        for (row = 0; row < matriz.length; row++) {
            for (col = 0; col < matriz[row].length; col++) {
                somaTotal += matriz[row][col];
            }
        }

        return somaTotal;
    }

    public static void imprimirMatriz(int[][] matriz) {
        int col = 0, row = 0;

        for (row = 0; row < matriz.length; row++) {
            for (col = 0; col < matriz[row].length; col++) {
                System.out.print(matriz[row][col] + " ");
            }
            System.out.println();
        }
    }
}
