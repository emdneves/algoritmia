// 14. Escreva um programa que lê uma matriz de tamanho 4x4 e encontra a soma dos elementos da diagonal principal.


import java.util.Scanner;

class Main

{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int size = 4;

        int[][] matriz = new int[size][size];

        // Read the matrix values
       
        for (int row = 0; row < size; row++)
        {
            for (int col = 0; col < size; col++)
            {                
                matriz[row][col] = col;
            }
        }

            // print the sum of elements of the matrix

        int print = matriz[0][0];

        // access the elements of the matrix
        System.out.println("matrix:");
        for (int row = 0; row < size; row++) 
        {
            for (int col = 0; col < size; col++) 
            {
                if (col == row) 
                print = print + matriz[row][col];
            }
        }
    System.out.println(print);
    }

}