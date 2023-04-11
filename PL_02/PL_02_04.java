import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

      //getting input 1
    System.out.print("insert place: ");
    int place = input.nextInt();

      //closing the scanner 
    input.close();
  
      // atribuir casos a lugares e imprimir os respectivos pontos
  switch (place) 
  {
    case 1: System.out.println(" 10 pontos ");
    break;
    case 2: System.out.println(" 8 pontos ");
    break;
    case 3: System.out.println(" 6 pontos ");
    break;
    case 4: System.out.println(" 5 pontos ");
    break;
    case 5: System.out.println(" 4 pontos ");
    break;
    case 6: System.out.println(" 3 pontos ");
    break;    
    case 7: System.out.println(" 2 pontos ");
    break;    
    case 8: System.out.println(" 1 pontos ");
    break;
    default: System.out.println(" 0 pontos ");       
  }
  }
}