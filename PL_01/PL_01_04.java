import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    //getting input 1
    System.out.print("Enter an integer: ");
    int input_1 = input.nextInt();
    System.out.println("You entered " + input_1);

      //closing the scanner 
    input.close();

      // declarar int da dos resultados
    int antes = (input_1 -1 );
    int apos = (input_1 + 1);
              
    System.out.println(antes);
    System.out.println(apos);

  }
}