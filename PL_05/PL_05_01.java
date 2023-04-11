// Implemente um programa que permita adicionar 10 números inteiros a um array 
// e que os imprima pela ordem de inserção.

import java.util.Scanner;

class Main 
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);


int[] list = new int[5];


for (int i = 0; i < 5; i = i + 1)
    {
        System.out.print("add value to vector: ");
        int value = input.nextInt();
        list[i] = value;
    }
// closing the scanner
input.close();


for (int x = 0; x < 5; x = x + 1)
    {
        System.out.println("position " + x + " - " + list[x]);
    }

}

}