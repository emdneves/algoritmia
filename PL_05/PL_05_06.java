// Escreva um programa que lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente

import java.util.Scanner;

class Main {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int count = 1, size = 5;
        int[] list = new int[5];

        for (int i = 0; i < size; i = i + 1) 
        {
            System.out.print("add : ");
            int value = input.nextInt();
            list[i] = value;
        }

        for (int x = 1; x < size; x = x + 1) 
        {
            if (list[x] < list[x - 1]) 
            {
                count++;
            }
        }
        if (count == size) 
        {
            System.out.println("crescente");
        } else 
        {
            System.out.println("decrescente");
        }
    }
}
