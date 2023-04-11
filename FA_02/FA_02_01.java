import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {

    Scanner input = new Scanner(System.in);

    // pedir número de quarto
    System.out.print("inserir número do quarto: ");
    String quarto = input.next();

    // pedir número de dias
    System.out.print("inserir número de dias: ");
    double dias = input.nextInt();

    // fecho do scanner
    input.close();

    // declaração das variáveis fixas (poderiam ser constantes mas não demos isso)
    double custo = 200, limpeza = 25, descontos = 0.23;

 
    double bruto = dias * custo; // calculo do valor bruto
    double custo_limpeza = dias * limpeza; // calculo do valor da limpeza
    double imposto = ((bruto - custo_limpeza) * descontos); // calculo do imposto
    double liquido = bruto - custo_limpeza - imposto; // calculo do valor liquido

     // impressao de todos os valores pedidos no enunciado
    System.out.println("valor liquido a receber pelas reservas totais do quarto " + quarto + ": " + liquido);
    System.out.println("total do custo da limpeza do quarto " + quarto + ": "  + custo_limpeza);
    System.out.println("valor de descontos fiscais a entregar ao estado pelo "  + quarto + ": " + imposto);
    System.out.println("valor líquido a receber pelo " + quarto + ": " + liquido);
    }
}