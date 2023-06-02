import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
Scanner input = new Scanner(System.in);

System.out.print("Introduza um ano: ");
int ano= input.nextInt();

if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){



System.out.println("O ano é bissexto.");
} else {
System.out.println("O ano não é bissexto.");
}}}



// 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048, 2052