// Import obrigatório do package para fazer a leitura das introduções de dados do utilizador
import java.util.Scanner;

class Main 
{
  public static void main(String[] args) {

    // Instância obrigatória da classe para fazer a leitura das introduções de dados do utilizador
    Scanner input = new Scanner(System.in);

    // Declarar variáveis
    int valor, n200=0, n100=0, n50=0, n20=0, n10=0, n5=0, resto;

    // Ler valor
    System.out.print("Introduz um valor:");
    valor= input.nextInt();

    //closing the scanner 
    input.close();

    // Valor tem de ser multiplo de 5 e positivo
    if(valor%5==0 && valor>0){

      
    //Perceber quantas notas de 200 devo ter
    n200 = valor / 200;
    resto = valor % 200;

    //Perceber quantas notas de 100 devo ter
    n100 = resto / 100;
    resto = resto % 100;

    //Perceber quantas notas de 50 devo ter
    n50 = resto / 50;
    resto = resto % 50;

    //Perceber quantas notas de 20 devo ter
    n20 = resto / 20;
    resto = resto % 20;

    //Perceber quantas notas de 10 devo ter
    n10 = resto / 10;
    resto = resto % 10;

    //Perceber quantas notas de 5 devo ter
    n5 = resto / 5;

      System.out.println("Notas de 200:"+n200);
      System.out.println("Notas de 100:"+n100);
      System.out.println("Notas de 50:"+n50);
      System.out.println("Notas de 20:"+n20);
      System.out.println("Notas de 10:"+n10);
      System.out.println("Notas de 5:"+n5);
    }else{
      System.out.println("Valor inválido!");
    }

    
  }
}