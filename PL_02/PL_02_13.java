import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 

  {
    Scanner input = new Scanner(System.in);

              //getting input
    System.out.print("choose option 1.create 2.update 3.delete 4.exit " + "\n");
    String op = input.next();

      //closing the scanner 
    input.close();
  
          // atribuir casos a lugares e imprimir os respectivos pontos
  switch (op) 
  {
    case "1": System.out.println("1.create");
    break;
    case "2": System.out.println("2.update");
    break;
    case "3": System.out.println("3.delete");
    break;
    default: ;

      
  }
  }
}