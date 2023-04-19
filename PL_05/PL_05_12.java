/* Faça um programa que preencha cada posição de uma matriz (3x3 elementos inteiros) com um valor introduzido pelo utilizador. 
Deverá indicar qual o maior e qual o menor dos valores guardados na matriz,
 e deverá imprimir todo o conteúdo da matriz de forma semelhante ao exercício 9. */

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

        int temporary = matriz[0][0], maior = matriz[0][0], menor = matriz[0][0];

        // Display the elements of the matrix
        System.out.println("matrix:");
        for (row = 0; row < size; row++) {
            for (col = 0; col < size; col++) {
                System.out.print(matriz[row][col] + " ");

                if (matriz[row][col] > temporary) {
                    maior = matriz[row][col];
                }
                if (matriz[row][col] < temporary) {
                    menor = matriz[row][col];
                }
                temporary = matriz[row][col];
            }
            System.out.println();
        }
        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        // closing the scanner
        input.close();
    }

}