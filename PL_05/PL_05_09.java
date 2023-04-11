// Implemente um programa que permita adicionar 9 números inteiros a uma matriz 3x3 e que os imprima com o seguinte aspeto gráfico (exemplo):
// 3 8 1 
// 7 4 2 
// 5 1 9

import java.util.Scanner;

class Main

{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter nr of rows of the matrix");
        int x = input.nextInt();

        System.out.println("Enter nr of columns of the matrix");
        int y = input.nextInt();

        int[][] matriz = new int[x][y];

        // Read the matrix values
        System.out.println("Enter the elements of the matrix");
        for (int row = 0; row < x; row++)
        {
            for (int col = 0; col < y; col++)
            {
                System.out.println("Insira matriz "+ row + " " + col +": ");
                matriz[row][col] = input.nextInt();
            }
        }


        // Display the elements of the matrix
        System.out.println("matrix:");
        for (int row = 0; row < x; row++) 
        {
            for (int col = 0; col < y; col++) 
            {
                System.out.print(matriz[row][col] +" ");
            }
            System.out.println();
        }
    }

}