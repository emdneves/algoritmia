import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

      //getting input 1
    System.out.print("valor1: ");
    int valor_1 = input.nextInt();
    System.out.println("inserido valor1: " + valor_1);

      //getting input 2
    System.out.print("valor2: ");
    int valor_2 = input.nextInt();
    System.out.println("inserido valor2: " + valor_2);

      //closing the scanner 
    input.close();

      valor_1 = valor_1 + valor_2;
      valor_2 = valor_1 - valor_2;
      valor_1 = valor_1 - valor_2;
    
      
      //permuta           
      System.out.println("valor1 = " + valor_1);
      System.out.println("valor2 = " + valor_2);
    

      
  }
}