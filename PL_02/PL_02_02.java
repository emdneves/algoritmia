import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

      //getting input 1
    System.out.print("insert salary: ");
    int salary = input.nextInt();

      //closing the scanner 
    input.close();

      // descobrir que numero é o maior
    if (salary >= 15000)
      System.out.println(salary * .2);
    else
      System.out.println(salary * .3);
         
  }
}