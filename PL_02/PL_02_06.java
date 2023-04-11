import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

      //getting input 1
    System.out.print("insert value 1: ");
    int value1 = input.nextInt();

          //getting input 1
    System.out.print("insert value 2: ");
    int value2 = input.nextInt();

      //closing the scanner 
    input.close();

      // descobrir que numero é o menor e apresentar ordenado
    if (value1 < value2 )
      System.out.println(value1 + " " + value2);
    else if (value2 < value1 )
      System.out.println(value2 + " " + value1);

  }
}