/*Escreva um programa que lê dois arrays de tamanho 10 
e gera uma matriz 10x2 com os elementos da primeira junto aos elementos da segunda. */

import java.util.Scanner;

class Main

{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = 3;

        // add values to vector 1
        int[] list1 = new int[3];
        for (int i = 0; i < size; i = i + 1) {
            System.out.print("add value to vector 1: ");
            int value = input.nextInt();
            list1[i] = value;
        }

        // add values to vector 2
        int[] list2 = new int[3];
        for (int i = 0; i < size; i = i + 1) {
            System.out.print("add value to vector 2: ");
            int value = input.nextInt();
            list2[i] = value;
        }

        int[][] matriz = new int[2][3];
        int col = 0;

        // Read the matrix values
        for (int row = 0; row < 2; row++) {
            if (row < 1) {
                for (col = 0; col < size; col++) {
                    matriz[row][col] = list1[col];
                    list1[col]++;
                    System.out.print(matriz[row][col] + " ");
                }
            } else {
                for (col = 0; col < size; col++) {
                    matriz[row][col] = list2[col];
                    list2[col]++;
                    System.out.print(matriz[row][col] + " ");
                }
            }
            System.out.println();

            // closing the scanner
            input.close();
        }
    }
}