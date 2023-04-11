import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

      //getting input 1
    System.out.print("insert number 1: ");
    int num1 = input.nextInt();

      //getting input 2
    System.out.print("insert number 2: ");
    int num2 = input.nextInt();

      //closing the scanner 
    input.close();

      // descobrir que numero é o maior
    if (num1 > num2)
    
      System.out.println(num1);
    else 
      System.out.println(num2);
    }
}