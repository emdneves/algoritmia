// 4. Escreva um programa que lê um array de tamanho 10 e encontra o menor elemento.

import java.util.Scanner;

class Main {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int[] list = new int[5];

        for (int i = 0; i < 5; i = i + 1) 
        {
            System.out.print("add : ");
            int value = input.nextInt();
            list[i] = value;
        }

        int to_print = list[0];

        if (list[0] < list[1]) 
        {
            to_print = list[0];
        } else
            to_print = list[1];

        for (int x = 1; x < 5; x = x + 1) 
        {
            if (list[x] < list[x - 1]) 
            {
                to_print = list[x];
            }
        }
        System.out.println("smallest value: " + to_print);
    }
}