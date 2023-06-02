import java.util.Scanner;

class Main 
{
public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);

//getting input 1
//getting input 1
    int n;
    int soma = 0;
    int counter = 0;
    
    do 
        {
        System.out.print("insert number: ");
        n = input.nextInt();
        soma = soma + n;
        counter = counter + 1;
        }
    while (n != -1);

//closing the scanner 
input.close();

    System.out.println("soma dos valores pedidos: " + soma);
    System.out.println("nº de valores pedidos: " + counter);
    int media = (++soma) / (--counter);
    System.out.println("media: " + media);
    }
}