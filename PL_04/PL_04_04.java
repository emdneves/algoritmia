
// 2. Escreva um programa que indique se um número pedido ao utilizador é primo. (Chamamos de número primo um número natural que possui dois divisores: 1 e ele mesmo).
import java.util.Scanner;

class Main {
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);

        int value;
        // getting option
        do
            {
            System.out.print("value between 0 and 100: \n");
            value = input.nextInt();
            }
        while (value >= 100 && value < 0);

        // divisores primos 2, 3, 5, 7

        if ((value % 2) == 0 && (value != 2)) 
        {
            System.out.print((value % 2) + " | value is not prime");
        }
        else if ((value % 3) == 0 && (value != 3)) 
        {
            System.out.print((value % 3) + " | value is not prime");
        }
        else if ((value % 5) == 0 && (value != 5)) 
        {
            System.out.print((value % 5) + " | value is not prime");
        }
        else if ((value % 7) == 0 && (value != 7)) 
        {
            System.out.print((value % 7) + " | value is not prime");
            
        } else
        {
            System.out.print("value is prime");
        }
        // closing the scanner
        input.close();
    }
}