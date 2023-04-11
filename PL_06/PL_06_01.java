// 1. Implemente uma função que determine se um número (passado por argumento) é par ou ímpar.
import java.util.Scanner;

public class PL_06_01 
{


    /**
     *
     * @param num
     * @return
     */
    public static boolean par(int num)
    {

        if(num%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) 
    {

        // Declarar variáveis
        int num;

        // Declaro o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Ficha 06 - Exercicio 1 *****");

        //Ler número inteiro do utilizador
        System.out.print("Introduza um número: ");
        num=input.nextInt();

        // closing the scanner
        input.close();  

        // Invocar a função "par"
        if(par(num))
        {
            System.out.println("É par");
        }
        else
        {
            System.out.println("É ímpar");
        }
    }


}