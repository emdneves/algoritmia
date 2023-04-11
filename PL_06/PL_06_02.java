//2. Implemente uma função que determine se um número (passado por argumento) é positivo ou negativo.

import java.util.Scanner;

public class PL_06_02 
{

    public static boolean positivo(int num) 
    {

        if (num >= 0) {
            return true;
        } else {
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

        // Ler número inteiro do utilizador
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // closing the scanner
        input.close();

        // Invocar a função "positivo"
        if (positivo(num)) 
        {
            System.out.println("positivo");
        } else {
            System.out.println("negativo");
        }
    }

}
