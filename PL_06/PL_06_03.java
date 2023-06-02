// 3. Implemente uma função que determine se um número (passado por argumento) é ou não primo.
import java.util.Scanner;


public class PL_06_03 

{

    public static boolean primo(int num) 
    {


        if ((num % 2) == 0 && (num != 2)) 
        {
            return false;    
        }
        else if ((num % 3) == 0 && (num != 3)) 
        {
            return false;     
        }
        else if ((num % 5) == 0 && (num != 5)) 
        {
            return false;    
        }
        else if ((num % 7) == 0 && (num != 7)) 
        {
        return false;      
        } else
        {
        return true;
        }

    }

    public static void main(String[] args) 
    {

        // Declarar variáveis
        int num;

        // Declaro o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Ficha 06 - Exercicio 1 *****");

        // Ler número inteiro do utilizador
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // closing the scanner
        input.close();

        // Invocar a função "primo"
        if (primo(num)) 
        {
            System.out.println("é primo");
        } else {
            System.out.println("não é primo");
        }
    }

}


