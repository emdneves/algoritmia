import java.util.Scanner;

class Main 
{
public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    //10. Escreva um algoritmo que leia uma quantidade desconhecida de números inteiros positivos fornecida pelo utilizador e conte quantos deles estão nos seguintes intervalos: 
    // [0.25], [26,50], [51,75] e [76,100]. A entrada de dados deve terminar quando for lido um número negativo.


    //getting inputs untill inserted a negative number
   int n, count0025 = 0, count2650 = 0, count5175 = 0, count76100 = 0;

    do 
        {
        System.out.print("insert number: ");
        n = input.nextInt();
            //evaluating if th inserted number fits the interval and adding one to the count if so 
            if (n < 25)
            {
            count0025 = count0025 + 1;
            }

            else if (n >= 26 && n <= 50 )
            {
            count2650 = count2650 + 1;
            }
            else if (n >= 51 && n <= 75 )
            {
            count5175 = count5175 + 1;
            }
            else if (n >= 76 && n <= 100 )
            {
            count76100 = count76100 + 1;
            }
        }
    while (n > 0);

    System.out.println("interval [0.25]   " + count0025);
    System.out.println("interval [26.50]  " + count2650);
    System.out.println("interval [51.75]  " + count5175);
    System.out.println("interval [76.100] " + count76100);

//closing the scanner 
input.close();
    }
}