import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

      //getting input 1
    System.out.print("insert valuea 1: ");
    int value1 = input.nextInt();
      //getting input 2
    System.out.print("insert value 2: ");
    int value2 = input.nextInt();
      //getting input 3
    System.out.print("insert value 3: ");
    int value3 = input.nextInt();

      //closing the scanner 
    input.close();

      // descobrir que numero é o maior e apresentar ordenado

    if (value1 < value2 && value1 < value3)
      System.out.println(value1);
    else if (value2 < value1 && value2 < value3)
      System.out.println(value2);
    else
      System.out.println("smallest value" + value3);
  }
}