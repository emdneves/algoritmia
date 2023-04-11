import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

          //getting input 1
    System.out.print("insert value1: ");
   double valor1 = input.nextDouble();

              //getting input 2
    System.out.print("insert value2: ");
    double valor2 = input.nextDouble();
    
      //getting input 1
    System.out.print("insert op: ");
    String op = input.next();

      //closing the scanner 
    input.close();
  
      // atribuir casos a lugares e imprimir os respectivos pontos
  switch (op) 
    {
    case "-": System.out.println("a subtracção dos valores é " + (valor1 - valor2));
    break;
    case "+": System.out.println("a adição dos valores é " + (valor1 + valor2));
    break;
    case "*": System.out.println("a multiplicação dos valores é " + (valor1 * valor2));
    break;
    case "/": System.out.println("a divisão dos valores é " + (valor1 / valor2));
    break;
    default: System.out.println("erro ");
    
System.out.print("continue? y/n ");
String cont = input.next();
    }

if (cont.equals("y"));
   {
          //getting input 1
          System.out.print("insert value1: ");
          valor1 = input.nextDouble();
       
                     //getting input 2
           System.out.print("insert value2: ");
           valor2 = input.nextDouble();
           
             //getting input 1
           System.out.print("insert op: ");
           op = input.next();
       
             //closing the scanner 
           input.close();
         
             // atribuir casos a lugares e imprimir os respectivos pontos
         switch (op) 
         {
           case "-": System.out.println("a subtracção dos valores é " + (valor1 - valor2));
           break;
           case "+": System.out.println("a adição dos valores é " + (valor1 + valor2));
           break;
           case "*": System.out.println("a multiplicação dos valores é " + (valor1 * valor2));
           break;
           case "/": System.out.println("a divisão dos valores é " + (valor1 / valor2));
           break;
           default: System.out.println("erro ");
        }
    }

else
{
System.out.print("ended ");
}
  }
}
