import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

          //getting input 1
    System.out.print("insert balance: ");
    double balance = input.nextDouble();

              //getting input 2
    System.out.print("insert credit or debit: ");
    double op = input.nextDouble();

      //closing the scanner 
    input.close();
  
      // 

    if ((balance + op) > 0 )
      System.out.println(balance + op);
    else
      System.out.println("invalid");       
  
  }
}