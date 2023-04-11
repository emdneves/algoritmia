import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {

String opcao="1";

switch (opcao){ 
        case "1":
    if (opcao.equals("2")){
        System.out.println("Primeira Opcao");
    }

    break;

    case "2":
        if(opcao.equals("1")) {
            System.out.println("Segunda Opcao");
        }
        break;

    default:
            System.out.println("Inválida");

  }}}