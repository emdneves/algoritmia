import java.util.Scanner;

class Main 
{
public static void main(String[] args) 
{
//starting the scanner 
Scanner input = new Scanner(System.in);

//asking for input 
System.out.print("insert x: ");
int n = input.nextInt();


//closing the scanner 
input.close();

System.out.println("13.  Escreva um programa que calcule e imprima o fatorial de um número inteiro não-negativo n. Utilize o ciclo while.");




int x = 0;
int z;

while (x <= n)
    {
        
        z = (n * x);
        x = x + 1;
        System.out.println(z);
        
    }  
}
}