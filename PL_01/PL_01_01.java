import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    //getting input 1
    System.out.print("Enter an integer: ");
    int input_1 = input.nextInt();
    System.out.println("You entered " + input_1);

      
    //getting input 2
    System.out.print("Enter an integer: ");
    int input_2 = input.nextInt();
    System.out.println("You entered " + input_2);

      //closing the scanner 
    input.close();

      // declarar int da soma
    int soma = (input_1 + input_2);
    
            
    System.out.println(soma);
  }
}