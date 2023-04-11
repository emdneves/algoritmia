import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {


Scanner input = new Scanner(System.in);
System.out.print("Introuza o valor do salário: "); double salario = input.nextDouble(); double aumento;


if (salario > 1200) {
aumento = salario * 0.10;
} else {
aumento = salario * 0.15;
}
System.out.println("O valor do aumento é " + aumento + "¤.");


  }}