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

    /* --------------------------------------------------ENUNCIADO------------------------------------------------------------------------*/


/* Elabore um menu, que permita ao utilizador escolher o que pretende fazer, sendo que as opções terão de corresponder
ao número do exercício seguido da sua descrição. (Todos os exercícios devem abrir o ficheiro acima mencionado, e devem
ser uma função própria (objeto de valorização)).
1. Imprima o seu conteúdo na consola.
2. Imprima quantas vendas foram executadas e o seu valor total.
3. Sabendo que a GameStart tem 10% de lucro em cada jogo, calcule o total de lucro.
4. Dado um idCliente, imprima todas as informações associadas a esse cliente (nome, contacto, email).
5. Dada uma Editora, imprima todos géneros e os respetivos jogos.
6. Imprima qual o jogo mais caro e os clientes que o compraram. */

/* 


    /* --------------------------------------------------PSEUDOCODE------------------------------------------------------------------------*/

/*   desta vez vou fazer  os comentários em português, apesar de o fazer para treino, entendo qe para o formador corrigir possa ser pior


 - nas 6 alineas vamos sempre precisar de aceeder aos valores do ficheiro. Assim, para evitar termos um scanner para cada, opta-se por guardar à priori os valores do ficheiro numa matriz, excluindo-se o cabeçalho. 
- isso é feito logo numa função lerDados, assim, caso o nome do ficheiro seja alterado, só temos que ir alterar o nome do ficheiro nos dois scanners
- que eu saiba, não se conseguiria faazer só com um scanner, uma vez que ainda não demos listas e precisamos de saber o quantidade de linhas para criarmos a matriz e posteriormente, preenche-lo
- assim, temos um scanner com um loop para descobrir o tamanho da matriz e um segundo pra o preencher (podiamos usar um array, mas teriamos que andar a fazer contas de 9 em 9 em todas as operações, o qe iria comprometer a legibilidade)
- na função menu, temos um switch case com um try catch e um while para dar feedback ao tulizador caso insira uma opção inválida e volte a perguntar até este escolher a opção 7, sair
    note-se que excepto as alineas 2 e 3, as otras funções nã dão um return mas um print. isso deve-se ao uso da função 2 na 3
- função 1, simplesmente imprimimos a matriz, e para a formatar, usamos um loop que descobre o tamanho do item que ocupa mais caracteres em cada matriz, depois ao imprimir é só formatar os espaços 
- função 2, vamos so iterar pela matriz, somando os valores da coluna valores e o dados.length vai nos dar o numero de vendas, uma vez que cada linha corresponde a uma venda
    para podermos utilizar o valor na função seguinte, temos que o gurdar numm unico elemento, uma vez que uma função só retorna um elemento. 
    Para isso, guardam-se osvalores num array de 2 posições, uma com o n de vendas e outraa com o somatório
- função 3, usamos o valor restornado pela função 2, na posição 1, que é o somatório de vendas e multiplicamos pr 0.10
- função 4, iteramos sobre a matriz até descobrirmos o id do cliente e imprimimos as posições correspondentes aos pedidos, contando as posições das colunas(nome, contacto, email)
- função auxiliar, durante os testes ao programa, pareceu-me complicado testar várias editoras. Assim, para facilitar, antes de se inserir a editora pretendida, o programa disponibiliza uma lista de editoras disponíveis
    para isso, recorremos novamente ao array dados, e iteramos pela coluna editoras. Para não se imprimirem editoras repetidas, vamos guardando os titlos ja impressos num arrray que tem o tamanho de todos os tilulos, assim este vai ficar parciamente vazio nas ultimas posições e conter apenas editoras não repetidas
- função 5,  usamos a mesma lógica da função auxiliar para remover os items duplicados, mas neste cas, os jogos, imprimindo-se os campos género e jogos de cada editor
- função 6, iteramos sobre toddos os valores dos jogos e descobrimos o mais caro, que vai ficar guardado numa variavel temporaria. depois usamos outro loop paraa descobrir que clientes o compraram. no fim é só imprimr o nome dos clientes correspondentes


poder-se-ia optar por usar a função 1 para ler os dados em todas as funções, mas isso causaria uma leitura do ficheiro e transformação em matriz de cada vez que isso acontecesse, iamos chamar a função, ela ia ler o ficheiro, gurardar numa matriz e retornar os dados.
Como guardamos logo os ficheiros na matriz, nas funções seguintes, só temos que usar a matriz em todos os ficheiros. 
*/ 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FA_04 {

    /* -----------------------------------------------------------------------função main --------------------------------------------------------------------------------------------------------------------------*/

    public static void main(String[] args) {
        String[][] dados = lerDados();
        menu(dados);

    }
     /* -----------------------------------------------------------------------função lerdados --------------------------------------------------------------------------------------------------------------------------*/
/*  - nas 6 alineas vamos sempre precisar de aceeder aos valores do ficheiro. Assim, para evitar termos um scanner para cada, opta-se por guardar à priori os valores do ficheiro numa matriz, excluindo-se o cabeçalho. 
    - isso é feito logo numa função lerDados, assim, caso o nome do ficheiro seja alterado, só temos que ir alterar o nome do ficheiro nos dois scanners 
    - que eu saiba, não se conseguiria faazer só com um scanner, uma vez que ainda não demos listas e precisamos de saber o quantidade de linhas para criarmos a matriz e posteriormente, preenche-lo
    - assim, temos um scanner com um loop para descobrir o tamanho da matriz e um segundo pra o preencher (podiamos usar um array, mas teriamos que andar a fazer contas de 9 em 9 em todas as operações, o qe iria comprometer a legibilidade)
    */
public static String[][] lerDados() {
    String[][] dados = null;
    try {
        Scanner scanner = new Scanner(new File("GameStart.csv"));
        int numLinhas = 0;
        scanner.nextLine();
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

     /* -----------------------------------------------------------------------função menu --------------------------------------------------------------------------------------------------------------------------*/
/*  - na função menu, temos um switch case com um try catch e um while para dar feedback ao tulizador caso insira uma opção inválida e volte a perguntar até este escolher a opção 7, sair
     note-se que excepto a alinea 2, as outras funções nã dão um return mas um print. isso deve-se ao uso da função 2 na 3 e termos que dar um return para poder reutilizar o valor */
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

        // loop até o utilizador inserir um input válido
        while (true) {
            try {
                opcao = Integer.parseInt(scanner.nextLine());
                if (opcao >= 1 && opcao <= 7) {
                    break;
                } else {
                    System.out.println("Opção inválida. Insira um número entre 1 e 7:");
                }
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Insira um número entre 1 e 7:");
                System.out.println("Erro: " + e.getMessage());
            }
        }

        switch (opcao) {
            case 1:
                imprimirDados(dados);
                break;
            case 2:
                double[] vendasEValor = vendasEValorTotal(dados);
                System.out.printf("O total de vendas foi %d e o valor total das vendas foi %.2f EUR\n",
                        (int) vendasEValor[0], vendasEValor[1]);
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
    scanner.close();
}

    /* -----------------------------------------------------------------------função 1--------------------------------------------------------------------------------------------------------------------------*/
/*  - na alinea 1, simplesmente imprimimos a matriz, e para a formatar, usamos um loop que descobre o tamanho do item que ocupa mais caracteres em cada matriz, depois ao imprimir é só formatar os espaços 
 */

public static void imprimirDados(String[][] dados) {
    // calculara dimensão máxima de cada coluna
    int[] largMaxColuna = new int[dados[0].length];
    for (int coluna = 0; coluna < dados[0].length; coluna++) {
        int max = 0;
        for (int linha = 0; linha < dados.length; linha++) {
            int len = dados[linha][coluna].length();
            if (len > max) {
                max = len;
            }
        }
        largMaxColuna[coluna] = max;
    }
    // imprimir os dados alinhados
    for (int linha = 0; linha < dados.length; linha++) {
        for (int coluna = 0; coluna < dados[linha].length; coluna++) {
            System.out.printf("%-" + largMaxColuna[coluna] + "s ", dados[linha][coluna]);
        }
        System.out.println();
    }
}
    /* -----------------------------------------------------------------------função 2--------------------------------------------------------------------------------------------------------------------------*/
/*     - função 2, vamos so iterar pela matriz, somando os valores da coluna valores e o dados.length vai nos dar o numero de vendas, uma vez que cada linha corresponde a uma venda
    para podermos utilizar o valor na função seguinte, temos que o gurdar numm unico elemento, uma vez que uma função só retorna um elemento. 
    Para isso, guardam-se osvalores num array de 2 posições, uma com o n de vendas e outraa com o somatório */

public static double[] vendasEValorTotal(String[][] dados) {
    int numVendas = dados.length;
    double valorTotal = 0;

    for (int i = 0; i < dados.length; i++) {
        valorTotal += Double.parseDouble(dados[i][8]);
    }

    // retornar o resultado em forma de array com 2 posições, uma com o numero de
    // vendas e um com o valor total de vendas
    double[] result = new double[2];
    result[0] = numVendas;
    result[1] = valorTotal;

    return result;
}

    /* -----------------------------------------------------------------------função 3--------------------------------------------------------------------------------------------------------------------------*/
/*     - função 3, usamos o valor restornado pela função 2, na posição 1, que é o somatório de vendas e multiplicamos pr 0.10
 */
    //usar a função do exercicio 2, ficando-se so com a coluna 1 correspondente ao valor total de venda, guardar numa variavel e multiplicar por 0.10
    public static void totalDeLucro(String[][] dados) {
        double valorTotal = vendasEValorTotal(dados)[1];
        double lucro = valorTotal * 0.10;
        System.out.printf("O total de lucro é %.2f EUR\n", lucro);
    }

    /* -----------------------------------------------------------------------função 4--------------------------------------------------------------------------------------------------------------------------*/
/*     - função 4, iteramos sobre a matriz até descobrirmos o id do cliente e imprimimos as posições correspondentes aos pedidos, contando as posições das colunas(nome, contacto, email)
 */
public static void informacoesCliente(String[][] dados) {
    Scanner input = new Scanner(System.in);

    System.out.print("Insira o idCliente: ");
    String idCliente = input.nextLine();
    String nome = " ";
    String contacto = " ";
    String email = " ";
    boolean encontrou = false;

    // iterar sobre a matriz até descobrir o id cliente e imprimir os dados 
    for (int i = 1; i < dados.length; i++) {
        if (dados[i][1].equals(idCliente)) {
            nome = dados[i][2];
            contacto = dados[i][3];
            email = dados[i][4];
            encontrou = true;
            break; // para a procura logo que é encontrado o primeiro id correspondente, assim imprime so uma vez e não tem que correr a matriz toda
        }
    }

    if (encontrou) {
        System.out.println("Nome: " + nome);
        System.out.println("Contacto: " + contacto);
        System.out.println("Email: " + email);
    } else {
        System.out.println("Não foram encontradas informações para o idCliente " + idCliente);
    }
}


    /* -----------------------------------------------------------------------função 5--------------------------------------------------------------------------------------------------------------------------*/
/*     - função 5,  usamos a mesma lógica da função auxiliar para remover os items duplicados, mas neste cas, os jogos, imprimindo-se os campos género e jogos de cada editor
 */
public static void generosEJogosPorEditora(String[][] dados) {
    Scanner input = new Scanner(System.in);

    listarEditoras(dados);

    System.out.print("Insira o nome da editora: ");
    String editora = input.nextLine();
    boolean encontrouJogos = false;

    // cria um array para acompanhar os jogos ja impressos
    String[] jogosImpressos = new String[dados.length];
    int numJogosImpressos = 0;

    for (int i = 1; i < dados.length; i++) {
        if (dados[i][5].equals(editora)) {
            String jogo = dados[i][7];
            // verifica se o jogo já foi impresso
            boolean jaImpresso = false;
            for (int j = 0; j < numJogosImpressos; j++) {
                if (jogosImpressos[j].equals(jogo)) {
                    jaImpresso = true;
                    break;
                }
            }
            if (!jaImpresso) {
                System.out.println("Género: " + dados[i][6]);
                System.out.println("Jogo: " + jogo);
                encontrouJogos = true;
                // adiciona o nome do jogo aos jogos já impressos
                jogosImpressos[numJogosImpressos] = jogo;
                numJogosImpressos++;
            }
        }
    }
    if (!encontrouJogos) {
        System.out.println("Não foram encontrados jogos para a editora " + editora);
    }
}

    /* -----------------------------------------------------------------------função auxiliar --------------------------------------------------------------------------------------------------------------------------*/
 /*     - função auxiliar, durante os testes ao programa, pareceu-me complicado testar várias editoras. Assim, para facilitar, antes de se inserir a editora pretendida, o programa disponibiliza uma lista de editoras disponíveis
    para isso, recorremos novamente ao array dados, e iteramos pela coluna editoras. Para não se imprimirem editoras repetidas, vamos guardando os titlos ja impressos num arrray que tem o tamanho de todos os tilulos, 
    assim este vai ficar parciamente vazio nas ultimas posições e conter apenas editoras não repetidas */

 public static void listarEditoras(String[][] dados) {
     // cria um array para acompanhar as editoras ja impressas
     String[] editorasImpressas = new String[dados.length];
     int numEditorasImpressas = 0;

     System.out.println("Editoras disponíveis: ");

     for (int i = 1; i < dados.length; i++) {
         String editora = dados[i][5];
         // verifica se a editora já foi impressa
         boolean jaImpresso = false;
         for (int j = 0; j < numEditorasImpressas; j++) {
             if (editorasImpressas[j].equals(editora)) {
                 jaImpresso = true;
                 break;
             }
         }
         if (!jaImpresso) {
             System.out.println("- " + editora);
             // adiciona a editora ao array das edioras já impressas
             editorasImpressas[numEditorasImpressas] = editora;
             numEditorasImpressas++;
         }
     }
 }

    /* -----------------------------------------------------------------------função 6--------------------------------------------------------------------------------------------------------------------------*/
/*     - função 6, iteramos sobre toddos os valores dos jogos e descobrimos o mais caro, que vai ficar guardado numa variavel temporaria. depois usamos outro loop paraa descobrir que clientes o compraram. no fim é só imprimr o nome dos clientes correspondentes
 */
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
    System.out.println(
            "O jogo mais caro é " + jogoMaisCaro + " que custa " + precoMaximo
                    + " EUR, comprado pelos seguintes clientes: " + clientesQueCompraram);
}

}
