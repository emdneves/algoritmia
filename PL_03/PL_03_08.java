import java.util.Scanner;

class Main 
{
public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);

    //getting input 1
    System.out.print("insert beginning: ");
    int inicial = input.nextInt();

 //closing the scanner 
input.close();   

    // estrutura de decisão para avaliar se o nº é par 
    if ((inicial % 2) == 0)
        {
        if (inicial < 2)
            do 
            {
            System.out.print(inicial + ", ");
            inicial = inicial + 2;  
            }
            while ( inicial <= 2);
        else
            do 
            {
            System.out.print(inicial + ", ");
            inicial = inicial - 2;  
            }
            while (inicial >= 2);
        }
    else 
        {
        if (inicial > 2)
            do
            {
            System.out.print(inicial - 1 + " ");
            inicial = inicial - 2;
            }
            while ( inicial >= 2);

        else
            do
            {
            System.out.print(inicial + 1 + " ");
            inicial = inicial + 2;
            }
            while ( inicial <= 2);
        }




       
    





    }
}