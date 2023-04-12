/* 
Implemente um programa que permita adicionar 9 números inteiros a uma matriz 3x3 e que os imprima com o seguinte aspeto gráfico (exemplo):
3 8 1 
7 4 2 
5 1 9 
*/

import java.util.Scanner;

class Main

{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int size = 7;

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
               print = print + matriz[row][col];
            }
        }
    System.out.println(print);
    }

}