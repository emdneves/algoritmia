/* Objetivos: 
• Elaborar um programa que cumpra os pré-requisitos enumerados no enunciado. 
• A cada pergunta, deve incrementar à pergunta anterior com as novas alterações. 
• Comentários no código-fonte são encorajados e alvo de avaliação. 
• Otimização é alvo de avaliação. 
• É obrigatório o programa executar (sem erros de compilação). 
• Deve ser usada linguagem Java para a resolução do presente projeto prático. 
• Deve ser entregue na tarefa do Microsoft Teams. */

/* Após ter terminado o curso de Software Developer, foi contactado pela loja de videojogos “GameStart” para a elaboração
de um programa que permita analisar, fazer pesquisas e gerir o seu negócio. Esta loja é dedicada à venda de videojogos,
sendo que armazenam todas as suas vendas num ficheiro CSV com os seguintes títulos de cabeçalho:


• Elaborar um programa que cumpra os pré-requisitos enumerados no enunciado. 

Idvenda: Identificador único da venda
idCliente: Identificador único do cliente
nomeCliente: Nome do cliente
Contacto: Contacto telefónico do cliente
Email: Endereço de email do cliente
Editora: Editora que publicou o jogo comprado
Categoria: Categoria em que o jogo comprado se encaixa
Jogo: Título do jogo comprado
Valor: Valor do jogo que foi comprado

Exemplo:
idVenda;idCliente;nomeCliente;contacto;email;editora;categoria;jogo;valor
V00-001;0001;Vitor Santos;910000001;vitor.santos@gmail.com;CD Projekt Red;RPG;The Witcher III: Wild Hunt;39.99
V00-002;0001;Vitor Santos;910000001;vitor.santos@gmail.com;Team Cherry;Metroidvania;Hollow Knight;19.99
V00-003;0002;Luis Camoes;910000002;lusiadas@gmail.com;Xbox Game Studios;Estrategia;Age of Empires IV;35.99

Elabore um menu, que permita ao utilizador escolher o que pretende fazer, sendo que as opções terão de corresponder
ao número do exercício seguido da sua descrição. (Todos os exercícios devem abrir o ficheiro acima mencionado, e devem
ser uma função própria (objeto de valorização)).
1. Imprima o seu conteúdo na consola.
2. Imprima quantas vendas foram executadas e o seu valor total.
3. Sabendo que a GameStart tem 10% de lucro em cada jogo, calcule o total de lucro.
4. Dado um idCliente, imprima todas as informações associadas a esse cliente (nome, contacto, email).
5. Dada uma Editora, imprima todos géneros e os respetivos jogos.
6. Imprima qual o jogo mais caro e os clientes que o compraram. */



pseudocode

use a loop to check how many lines the ile contains

read the values of the file and store them in an array or matrix





import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FA_04 {
    public static void main(String[] args) {
        String[][] dados = lerDados();
        menu(dados);
    }

    public static String[][] lerDados() {
        String[][] dados = null;
        try {
            Scanner scanner = new Scanner(new File("GameStart.csv"));
            int numLinhas = 0;
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                numLinhas++;
            }
            scanner.close();
            dados = new String[numLinhas][9];
            scanner = new Scanner(new File("GameStart.csv"));
            scanner.nextLine();
            int linha = 0;
            while (scanner.hasNextLine()) {
                String linhaDados = scanner.nextLine();
                String[] campos = linhaDados.split(";");
                for (int coluna = 0; coluna < campos.length; coluna++) {
                    dados[linha][coluna] = campos[coluna];
                }
                linha++;
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
        return dados;
    }

    public static void menu(String[][] dados) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 7) {
            System.out.println("\n\nEscolha uma opção:");
            System.out.println("1. Imprimir todos os dados");
            System.out.println("2. Imprimir quantas vendas foram executadas e o seu valor total");
            System.out.println("3. Calcular o total de lucro da GameStart");
            System.out.println("4. Imprimir todas as informações associadas a um idCliente");
            System.out.println("5. Imprimir todos géneros e os respetivos jogos de uma Editora");
            System.out.println("6. Imprimir o jogo mais caro e os clientes que o compraram");
            System.out.println("7. Sair");
        
            opcao = scanner.nextInt();
        
            switch (opcao) {
                case 1:
                    imprimirDados(dados);
                    break;
                case 2:
                    vendasEValorTotal(dados);
                    break;
                case 3:
                    totalDeLucro(dados);
                    break;
                case 4:
                    informacoesCliente(dados);
                    break;
                case 5:
                    generosEJogosPorEditora(dados);
                    break;
                case 6:
                    jogoMaisCaroEClientes(dados);
                    break;
                case 7:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
        

    // função 1
    public static void imprimirDados(String[][] dados) {
        for (int linha = 0; linha < dados.length; linha++) {
            for (int coluna = 0; coluna < dados[linha].length; coluna++) {
                System.out.print(dados[linha][coluna] + " ");
            }
            System.out.println();
        }
    }

    // função 2
    public static void vendasEValorTotal(String[][] dados) {
        int numVendas = dados.length - 1; 
        double valorTotal = 0;

        for (int i = 1; i < dados.length; i++) {
            valorTotal += Double.parseDouble(dados[i][8]);
        }

        System.out.println("Número de vendas: " + numVendas);
        System.out.println("Valor total de vendas: " + valorTotal + "€");
    }

    // função 3
    public static void totalDeLucro(String[][] dados) {
        double lucroTotal = 0;

        for (int i = 1; i < dados.length; i++) {
            double valorVenda = Double.parseDouble(dados[i][8]);
            double lucro = valorVenda * 0.1;
            lucroTotal += lucro;
        }

        System.out.println("Total de lucro: " + lucroTotal + "€");
    }

    // função 4
    public static void informacoesCliente(String[][] dados) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o idCliente: ");
        String idCliente = input.nextLine();

        boolean encontrou = false;

        for (int i = 1; i < dados.length; i++) {
            if (dados[i][1].equals(idCliente)) {
                System.out.println("Nome: " + dados[i][2]);
                System.out.println("Contacto: " + dados[i][3]);
                System.out.println("Email: " + dados[i][4]);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Não foram encontradas informações para o idCliente " + idCliente);
        }
    }

    // função 5
    public static void generosEJogosPorEditora(String[][] dados) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Insira o nome da editora: ");
        String editora = input.nextLine();
    
        boolean encontrou = false;
    
        for (int i = 1; i < dados.length; i++) {
            if (dados[i][5].equals(editora)) {
                System.out.println("Gênero: " + dados[i][6]);
                System.out.println("Jogo: " + dados[i][7]);
                encontrou = true;
            }
        }
    
        if (!encontrou) {
            System.out.println("Não foram encontrados jogos para a editora " + editora);
        }
    }

    // função 6
    
    public static void jogoMaisCaroEClientes(String[][] dados) {
    double precoMaximo = Double.MIN_VALUE;
    String jogoMaisCaro = "";
    String clientesQueCompraram = "";

    // Encontra o jogo mais caro
    for (int i = 1; i < dados.length; i++) {
        double precoAtual = Double.parseDouble(dados[i][8]);

        if (precoAtual > precoMaximo) {
            precoMaximo = precoAtual;
            jogoMaisCaro = dados[i][7];
        }
    }

    // Encontra os clientes que compraram o jogo mais caro
    for (int i = 1; i < dados.length; i++) {
        if (dados[i][7].equals(jogoMaisCaro)) {
            clientesQueCompraram += dados[i][2] + ", ";
        }
    }

    // Imprime o resultado
    System.out.println("O jogo mais caro é " + jogoMaisCaro + ", comprado pelos seguintes clientes: " + clientesQueCompraram);
}
}
    

