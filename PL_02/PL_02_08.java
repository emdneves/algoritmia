import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

      //getting input 1
    System.out.print("insert value 1: ");
    int value1 = input.nextInt();

      //closing the scanner 
    input.close();

      // descobrir que numero é o maior
    if (value1 % 2 == 0 )
      System.out.println("par");
    else
      System.out.println("impar");

  }
}