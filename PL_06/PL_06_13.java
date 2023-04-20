
/*
13. Escreva um programa para desenhar um quadrado no ecrã. Esse quadrado deverá ser desenhado por uma função para a qual são passados três argumentos: caracter a utilizar, número de linhas e número de colunas. Segue-se um exemplo do algoritmo a ser executado, ilustrando o pretendido:
Introduza um caracter: z
Introduza o número de linhas: 4
Introduza o número de colunas: 6
zzzzzz
z    z
z    z
zzzzzz
 */
import java.util.Scanner;

class Main 
{

    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in); /* intitalizing scanner */

        System.out.println("Enter size");
        int size = input.nextInt();

        System.out.println("Enter type of character");
        String caractere = input.next();

        input.close(); /* closing the scanner */

        quadrado(caractere, size);

    }

    public static void quadrado(String caractere, int size) 
    {
        // Read the matrix values
        for (int row = 0; row < size; row++) 
        {
            for (int col = 0; col < size; col++) 
            {
                if (col + row == row || col + row == col || col == size - 1 || row == size - 1  )
                    
                    System.out.print(caractere);
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

/*|   0 |  1 |  2 |  3
----------------------
0 |  00 | 01 | 02 | 03
1 |  10 | 11 | 12 | 13
2 |  20 | 21 | 22 | 23
3 |  30 | 31 | 32 | 33  */  