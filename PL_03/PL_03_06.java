import java.util.Scanner;

class Main 
{
public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);

      //getting input 1
    System.out.print("insert number: ");
    int start = input.nextInt();

        //closing the scanner 
    input.close();

    int limite_sup = start + 5;
    int limite_inf = start - 5;
        while (start <= limite_sup)
            {
            System.out.println(start);
            start = start + 1; 
            }

            System.out.println("----------");
        start = start - 5;
        while (start > limite_inf)
            {
            System.out.println(start);
            start = start - 1; 
            }        



  }
}