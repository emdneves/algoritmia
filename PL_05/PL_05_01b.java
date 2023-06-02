// Implemente um programa que permita adicionar 10 números inteiros a um array 
// e que os imprima pela ordem de inserção.

import java.util.Scanner;

class Main {
        
    
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);

int i = 0;
int x = 0;
int[] list = new int[10];


// lê um valor, adiciona-o a uma posição da lista, adiciona 1 ao contador de posições da lista e volta  aperguntar enquanto i < 4
while (i <= 10)
    {
        System.out.print("add value to vector: ");
        int value = input.nextInt();
        i++;
        list[i] = value;
    }

while (x <= 10)
    {    
        x++;
        System.out.println("position " + x + " - " + list[x]);
    }

// closing the scanner
input.close();
}
}
