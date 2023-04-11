// 3. Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento.

import java.util.Scanner;

class Main 
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);

int temporary = 0;
int[] list = new int[5];
int print = 0;

for (int i = 0; i < 5; i = i + 1)
    {
        System.out.print("add price: ");
        int value = input.nextInt();
        list[i] = value;
    }

for (int x = 0; x < 5; x = x + 1)
    {

        if (list[x] > temporary)
            {
                print = list[x];
            }
        temporary = (list[x]);
    }
System.out.println("biggest value: " + print);

}

}