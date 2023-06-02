import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    //getting input 1
    System.out.print("insert grade 1: ");
    double grade1 = input.nextDouble();
    //getting input 2
    System.out.print("insert grade 2: ");
    double grade2 = input.nextDouble();      
    //getting input 3
    System.out.print("insert grade 3: ");
    double grade3 = input.nextDouble();
    
      //closing the scanner 
    input.close();

      // descobrir que numero é o maior

    double ponderada = ((grade1 * 0.25) + (grade2 * 0.35) + (grade3 * 0.4) /3 );
             
    
    if (ponderada >= 9.5 )
      System.out.println("aprovado com a média de: " + ponderada);
    else
      System.out.println("reprovado com a média de: " + ponderada);

  }
}