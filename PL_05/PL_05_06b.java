// Escreva um programa que lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente

import java.util.Scanner;

class Main {

    public static void main(String[] args) 
    {

        // create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);


        int count = 1, size = 5, nextNum = 0;
        int[] list = new int[size];

        for (int i = 0; i < size; i = i + 1) 
        {
            System.out.print("add number: ");
            nextNum = input.nextInt();
            list[i] = nextNum;
        
        if (nextNum > list[i]) 
        {
            count++;
        }
        
    }

        }
    // check if the count is equal to the size of the sequence
    if(count==size)

    {
        System.out.println("The sequence is in increasing order.");
    }else
    {
        System.out.println("The sequence is not in increasing order.");
    }
    // close the scanner object
    scanner.close();
}}