
// Import obrigatório do package para fazer a leitura das introduções de dados do utilizador
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("\n***** Ficha 2 - Exercicio 16 ******\n");

    // Instância obrigatória da classe para fazer a leitura das introduções de dados
    // do utilizador
    Scanner input = new Scanner(System.in);

    // Declarar as variáveis
    int a, b, c;
    String opcao;

    // Ler a
    System.out.print("Introduz um numero:");
    a = input.nextInt();

    // Ler b
    System.out.print("Introduz um numero:");
    b = input.nextInt();

    // Ler c
    System.out.print("Introduz um numero:");
    c = input.nextInt();

    // Ler opcao
    System.out.print("Ordem Crescente (C) ou Decrescente (D):");
    opcao = input.next();

//closing the scanner 
input.close();

    //Ordem crescente
    if (opcao.compareTo("C") == 0) {
       System.out.print("Escolheu Ordem Crescente (C)");
      if (a < b && a < c) { // a vem sempre primeiro
        if (b < c) {
          System.out.println(a + " " + b + " " + c); // abc
        } else {
          System.out.println(a + " " + c + " " + b); // acb
        }
      }

      if (b < a && b < c) { // b vem sempre primeiro
        if (a < c) {
          System.out.println(b + " " + a + " " + c); // bac
        } else {
          System.out.println(b + " " + c + " " + a); // bca
        }
      }

      if (c < a && c < b) { // c vem sempre primeiro
        if (a < b) {
          System.out.println(c + " " + a + " " + b); // cab
        } else {
          System.out.println(c + " " + b + " " + a); // cba
        }
      }
    }

        //Ordem decrescente
    if (opcao == "D") {
      System.out.print("Escolheu Ordem Decrescente (D)");
      if (a > b && a > c) { // a vem sempre primeiro
        if (b > c) {
          System.out.println(a + " " + b + " " + c); // abc
        } else {
          System.out.println(a + " " + c + " " + b); // acb
        }
      }

      if (b > a && b > c) { // b vem sempre primeiro
        if (a > c) {
          System.out.println(b + " " + a + " " + c); // bac
        } else {
          System.out.println(b + " " + c + " " + a); // bca
        }
      }

      if (c > a && c > b) { // c vem sempre primeiro
        if (a > b) {
          System.out.println(c + " " + a + " " + b); // cab
        } else {
          System.out.println(c + " " + b + " " + a); // cba
        }
      }
    }

  }
}
