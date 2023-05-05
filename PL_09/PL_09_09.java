import java.util.Scanner;
import java.io.PrintStream;

public class PL_09_09 {
    public PL_09_09() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o nome do produto: ");
        String nome = input.next();
        System.out.print("Insira o preço do produto: ");
        double preco = input.nextDouble();
        Produto produto = new Produto(nome, preco);

        int opcao;
        do {
            System.out.println("\nControlo do Produto: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());

            do {
                System.out.println("\n***** Menu *****");
                System.out.println("\n1 - Comprar ");
                System.out.println("2 - Vender");
                System.out.println("3 - Consultar Stock");
                System.out.println("4 - Sair");
                System.out.print("\nEscolha uma opção: ");
                opcao = input.nextInt();
            } while(opcao < 1 || opcao > 4);

            int quantidade;
            switch (opcao) {
                case 1:
                    System.out.println("\n***** Comprar *****");
                    System.out.print("Quantas unidades quer comprar: ");
                    quantidade = input.nextInt();
                    produto.comprar(quantidade);
                    break;
                case 2:
                    System.out.println("\n***** Vender *****");
                    System.out.print("Quantas unidades quer vender: ");
                    quantidade = input.nextInt();
                    produto.vender(quantidade);
                    break;
                case 3:
                    System.out.println("\nTem " + produto.getStock() + " unidades em stock!\n");
                    break;
                case 4:
                    System.out.println("Até à próxima");
            }
        } while(opcao != 4);

    }
}

