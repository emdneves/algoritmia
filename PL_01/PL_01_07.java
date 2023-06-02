import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

      //getting input 1
    System.out.print("insert value: ");
    int input_1 = input.nextInt();
    System.out.println("You entered " + input_1);

      //getting input 2
    System.out.print("insert value: ");
    int input_2 = input.nextInt();
    System.out.println("You entered " + input_2);

      //getting input 3
    System.out.print("insert value: ");
    int input_3 = input.nextInt();
    System.out.println("You entered " + input_2);

      //closing the scanner 
    input.close();

      // declarar somas
    double soma = (input_1 + input_2 + input_3);
    double descontado = (soma * 0.9);
             
    System.out.println("valor final = " + descontado);
  }
}