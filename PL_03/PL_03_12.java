
/*12.  Escreva um programa que leia uma sequência de números inteiros do utilizador e determine se a sequência está em ordem crescente.*/
import java.util.Scanner;

class Main 
{

    public static void main(String[] args) 
    {

        // create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the sequence: ");
        int size = scanner.nextInt();

        System.out.print("Enter the first number: ");
        int num = scanner.nextInt();

        int count = 1;
        int i = 1;
        while (i < size) 
        {
            System.out.print("Enter the next number: ");
            int nextNum = scanner.nextInt();
            i++;
            if (nextNum > num) 
            {
                count++;
            }
            num = nextNum;
        }
        // check if the count is equal to the size of the sequence
        if (count == size) 
        {
            System.out.println("The sequence is in increasing order.");
        } else 
        {
            System.out.println("The sequence is not in increasing order.");
        }
        // close the scanner object
        scanner.close();
    }
}