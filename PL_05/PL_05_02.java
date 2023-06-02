// Implemente um programa que permita adicioanr 
// o preço de produtos a um array de tamanho 10 e calcular o seu total.

import java.util.Scanner;

class Main 
{
    
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);

int z = 5;
int[] list = new int[z];

int soma = 0;
for (int i = 0; i < z; i = i + 1)
    {
        System.out.print("add price: ");
        int value = input.nextInt();
        list[i] = value;
    }

for (int x = 0; x < z; x = x + 1)
    {
        soma = soma + (list[x]);
    }
System.out.println(soma);

}

}