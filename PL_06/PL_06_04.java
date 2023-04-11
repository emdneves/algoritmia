//4. (Opcional) Implemente uma função que determine se um número (passado por argumento) é perfeito
import java.util.Scanner;
public class PL_06_04 
    {

        public static boolean perfeito(int num) 
        {

            int soma = 0;
            {
            for (int n = 1; n < num; n ++)
                if (num % n == 0)
                soma = soma + n;
            }
            if (soma == num)
                return true;
            else
                return false;
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
    
            // Invocar a função "par"
            if (perfeito(num)) 
            {
                System.out.println("perfeito");
            } else {
                System.out.println("não é perfeito");
            }
        }
    }
    

    