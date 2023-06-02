/* Faça um programa que preencha cada posição de uma matriz 4x5 com valores inteiros introduzidos pelo utilizador. 
Deverá depois ler um outro valor do utilizador e indicar quantos vezes existe na matriz.*/

import java.util.Scanner;

class Main

{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = 3;

        int[][] matriz = new int[size][size];

        int col = 0, row = 0;

        // Read the matrix values
        for (row = 0; row < size; row++) {
            for (col = 0; col < size; col++) {
                System.out.println("Insira matriz " + row + " " + col + ": ");
                matriz[row][col] = input.nextInt();
            }
        }

        System.out.println("Insira o repetido:");
        int repeat = input.nextInt();
        int count = 0;

        // Display the elements of the matrix
        System.out.println("matrix:");
        for (row = 0; row < size; row++) {
            for (col = 0; col < size; col++) {
                System.out.print(matriz[row][col] + " ");
                if (matriz[row][col] == repeat) {
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("o número " + repeat + " é repetido " + count + " vezes");
        // closing the scanner
        input.close();
    }

}