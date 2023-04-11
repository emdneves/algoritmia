// Implemente um programa que armazene num array 10 valores pedidos ao utilizador,
// e retorne o maior valor par inserido. Caso não exista, deverá informar o utilizador.

import java.util.Scanner;

class Main 
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);

int[] list = new int[5];

System.out.print("add : ");
list[0] = input.nextInt();

for (int i = 1; i < 5; i = i + 1)
    {
        System.out.print("add : ");
        int value = input.nextInt();
        list[i] = value;
    }
int temporary = list[0];
int print = list[0];

for (int x = 0; x < 5; x = x + 1)
    {
    if (list[x] > temporary && list[x] % 2 == 0 )
        {
            print = list[x];
            temporary = (list[x]);
        }
    }
    if (print %2 == 0)
    {
        System.out.println("biggest even value: " + print);
    }
    else
    {
        System.out.println("impar");
    }
}
}