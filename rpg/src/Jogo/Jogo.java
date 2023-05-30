package Jogo;

import Entidades.*;
import Entidades.Herois.Arqueiro;
import Entidades.Herois.Cavaleiro;
import Entidades.Herois.Feiticeiro;
import Itens.Arma;
import Itens.PocaoHP;
import Itens.TiposHeroi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe principal que contém o método main para executar o jogo.
 */
public class Jogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean venceu;
        String resposta = "";

        do {
            int heroiEscolhido;
            Heroi heroi = null;
            boolean opcaoValida = false;

            // Loop para solicitar ao user que selecione a classe do herói
            /*------------------------------------------------SELECCIONAR TIPO DE HERÓI----------------------------------------------------------------------------*/

            while (!opcaoValida) {
                System.out.println("                              ");
                System.out.println("           MENU           ");
                System.out.println("1. CAVALEIRO ");
                System.out.println("2. FEITICEIRO ");
                System.out.println("3. ARQUEIRO ");
                System.out.print("SELECCIONAR TIPO DE HERÓI: ");

                try {
                    String input = scanner.nextLine();
                    heroiEscolhido = Integer.parseInt(input);

                    switch (heroiEscolhido) {
                        case 1 -> {
                            heroi = criarCavaleiro();
                            opcaoValida = true;
                        }
                        case 2 -> {
                            heroi = criarFeiticeiro();
                            opcaoValida = true;
                        }
                        case 3 -> {
                            heroi = criarArqueiro();
                            opcaoValida = true;
                        }
                        default -> {
                            System.out.println("");
                            System.out.println("---------------------------------");
                            System.out.println("OPÇÃO INVÁLIDA, INSERIR 1, 2 OU 3");
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("");
                    System.out.println("---------------------------------");
                    System.out.println("ERRO, INSERIR NÚMERO 1, 2 OU 3");
                }
            }

            opcaoValida = false;
            int dificuldade = 0;

            /*------------------------------------------------SELECCIONAR DIFICULDADE----------------------------------------------------------------------------*/
            while (!opcaoValida) {
                try {
                    System.out.println("                                          ");
                    System.out.println("           DIFICULDADE           ");
                    System.out.println("1. FÁCIL - 300 PONTOS DE VIDA");
                    System.out.println("2. DIFÍCIL - 220 PONTOS DE VIDA");
                    System.out.print("ESCOLHE A DIFICULDADE: ");

                    String input = scanner.nextLine();
                    dificuldade = Integer.parseInt(input);

                    if (dificuldade == 1 || dificuldade == 2) {
                        opcaoValida = true;
                    } else {
                        System.out.println("---------------------------------");
                        System.out.println("OPÇÃO INVÁLIDA, INSERIR 1 OU 2");
                        System.out.println("---------------------------------");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("---------------------------------");
                    System.out.println("ERRO, INSERE 1 OU 2");
                    System.out.println("---------------------------------");
                }
            }

            int ouro;
            if (dificuldade == 1) {
                ouro = 20;
            } else {
                ouro = 15;
            }
            heroi.setOuro(ouro);

            /*------------------------------------------------DISTRIBUIÇÃO DOS PONTOS----------------------------------------------------------------------------*/
            int pontosCriacao;
            int pontosVida;
            int pontosForca = 0;

            do {
                if (dificuldade == 1) {
                    pontosCriacao = 300;
                    System.out.println("           300 PONTOS DE CRIAÇÃO           ");
                    System.out.println("---------------------------------");

                } else if (dificuldade == 2) {
                    pontosCriacao = 220;
                    System.out.println("           220 PONTOS DE CRIAÇÃO           ");
                    System.out.println("---------------------------------");
                } else {
                    System.out.println("OPÇÃO INVÁLIDA, A ENCERRAR");
                    return;
                }

                System.out.println("                                                ");
                System.out.println("           PONTOS DE VIDA           ");
                System.out.println("• 1 PONTO DE VIDA  = 1 DE CRIAÇÃO");
                System.out.println("• 1 PONTO DE VIDA = 5 DE FORÇA");
                System.out.println("---------------------------------");
                System.out.println("PONTOS DE VIDA DISPONÍVEIS: " + pontosCriacao);
                System.out.println("---------------------------------");
                System.out.print("PONTOS DE VIDA: ");
                pontosVida = scanner.nextInt();

                if (pontosVida > pontosCriacao) {
                    System.out.println("NÃO PODES GASTAR TANTOS PONTOS");
                    continue;
                }

                System.out.println("PONTOS DE FORÇA DISPONÍVEIS: " + ((pontosCriacao - pontosVida) / 5));
                System.out.println("---------------------------------");
                System.out.println("                                                ");
                System.out.println("           PONTOS DE FORÇA           ");
                pontosForca = scanner.nextInt();

                if (pontosForca > (pontosCriacao - pontosVida) / 5) {
                    System.out.println("---------------------------------");
                    System.out.println("NÃO PODES GASTAR TANTOS PONTOS");
                    continue;
                }

                if (pontosVida + pontosForca * 5 != pontosCriacao) {
                    System.out.println("---------------------------------");
                    System.out.println("DISTRIBUIÇÃO INVÁLIDA. A SOMA DOS PONTOS DE FORÇA E DE VIDA DEVE SER IGUAL AOS PONTOS DE CRIAÇÃO");
                }
            } while (pontosVida + pontosForca * 5 != pontosCriacao);

            /*------------------------------------------------ATRIBUIÇÃO DOS PONTOS----------------------------------------------------------------------------*/
            heroi.setVida(pontosVida);
            heroi.setForca(pontosForca);

            /*------------------------------------------------INÍCIO DO LABIRINTO----------------------------------------------------------------------------*/

            System.out.println("           JOGO A INICIAR           ");
            heroi.mostrarDetalhes(); // mostra os detalhes do herói
            System.out.println("");

            System.out.println("CHEGAS AO CESAE DE MANHÃ, E DEPARAS-TE COM A MÁQUINA DE VENDING");
            System.out.println("QUERES COMPRAR ALGUMA COISA?");


            /*------------------------------------------------ BATALHA----------------------------------------------------------------------------*/

            venceu = labirinto(0, heroi);

            if (venceu == true) {
                System.out.println("SAFASTE-TE");
                heroi.mostrarDetalhes();
            } else {
                System.out.println("CHUMBASTE");
                System.out.println("TENTAR NOVAMENTE S/N");
                System.out.print("RESPOSTA: ");
                resposta = scanner.next();
                resposta = resposta.toUpperCase();
                //Input da reposta. Se a resposta for "S", repete.
            }

        } while (resposta.equals("S"));
    }


    /*------------------------------------------------ RESET----------------------------------------------------------------------------*/

    /**
     * Função responsável por reiniciar o jogo caso o jogador decida.
     *
     * @param message mensagem exibida ao jogador.
     */

    private static void reset(String message) {

        if (message != null) {  // Verifica se a mensagem não é nula
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n" + message + "\n");  // Exibe a mensagem


            int op;
            do {
                System.out.println("1 - CONTINUAR");
                System.out.println("2 - SAIR");
                System.out.print("RESPOSTA: ");
                op = scanner.nextInt();
            } while (op < 1 || op > 2);  // Repete o loop se a opção for inválida

            if (op == 1) {  // Se a opção for 1 o método main para reiniciar o jogo
                main(null);
            }
        }
    }

    /*------------------------------------------------ LABIRINTO----------------------------------------------------------------------------*/

    /**
     * Função que representa o labirinto do jogo.
     *
     * @param op    a opção escolhida pelo jogador.
     * @param heroi o objeto do tipo Heroi representando o jogador.
     * @return true se o jogo continua, false se o jogo termina.
     */

    public static boolean labirinto(int op, Heroi heroi) {
        Scanner scanner = new Scanner(System.in);

        boolean p = false;

        ArrayList<TiposHeroi> tiposHeroi = new ArrayList<>();
        tiposHeroi.add(TiposHeroi.CAVALEIRO);
        tiposHeroi.add(TiposHeroi.ARQUEIRO);
        tiposHeroi.add(TiposHeroi.FEITICEIRO);

        ArrayList<TiposHeroi> todosTiposHeroi = new ArrayList<>();
        todosTiposHeroi.add(TiposHeroi.CAVALEIRO);
        todosTiposHeroi.add(TiposHeroi.ARQUEIRO);
        todosTiposHeroi.add(TiposHeroi.FEITICEIRO);

        ArrayList<TiposHeroi> heroiCavaleiro = new ArrayList<>();
        heroiCavaleiro.add(TiposHeroi.CAVALEIRO);

        ArrayList<TiposHeroi> heroiArqueiro = new ArrayList<>();
        heroiArqueiro.add(TiposHeroi.ARQUEIRO);

        ArrayList<TiposHeroi> heroiFeiticeiro = new ArrayList<>();
        heroiFeiticeiro.add(TiposHeroi.FEITICEIRO);

        //Instancias dos items e NPC's
        PocaoHP cozido = new PocaoHP("COZIDO À PORTUGUESA", 5, tiposHeroi, 5);
        PocaoHP tripas = new PocaoHP("TRIPAS À MODA DO PORTO", 15, tiposHeroi, 20);
        PocaoHP francesinha = new PocaoHP("FRANCESINHA", 10, tiposHeroi, 10);

        Arma colher = new Arma("COLHER DE PAU", 5, todosTiposHeroi, 20);
        Arma vassoura = new Arma("VASSOURA", 5, todosTiposHeroi, 20);
        Arma esfregona = new Arma("ESFREGONA", 10, todosTiposHeroi, 20);
        Arma panela = new Arma("PANELA", 8, heroiFeiticeiro, 2);
        Arma superBock = new Arma("SUPER BOCK", 10, heroiFeiticeiro, 20);
        Arma tinto = new Arma("GARRAFA DE MADURO TINTO", 20, heroiCavaleiro, 20);
        Arma branco = new Arma("GARRAFA DE MADURO BRANCO", 20, heroiArqueiro, 20);
        Arma bagaco = new Arma("BAGAÇO", 20, heroiArqueiro, 20);
        Arma sopa = new Arma("SOPA", 15, heroiCavaleiro, 20);
        Arma cachaca = new Arma("CACHAÇA", 10, heroiCavaleiro, 20);

        NPC testePoo = new NPC("TESTE DE POO", 200, 100);
        NPC trabalhoUml = new NPC("TRABALHO DE UML", 60, 20);
        NPC enviarCv = new NPC("ENVIAR CV E LINKEDIN", 60, 20);
        NPC ressaca = new NPC("RESSACA", 15, 5);
        NPC projectoFinal = new NPC("PROJECTO FINAL", 90, 30);

        //Instancia do Vendedor
        Vendedor vendedor1 = new Vendedor();

        vendedor1.adicionarItem(cozido);
        vendedor1.adicionarItem(tripas);
        vendedor1.adicionarItem(francesinha);
        vendedor1.adicionarItem(colher);
        vendedor1.adicionarItem(vassoura);
        vendedor1.adicionarItem(esfregona);
        vendedor1.adicionarItem(panela);
        vendedor1.adicionarItem(superBock);
        vendedor1.adicionarItem(tinto);
        vendedor1.adicionarItem(branco);
        vendedor1.adicionarItem(bagaco);
        vendedor1.adicionarItem(sopa);
        vendedor1.adicionarItem(cachaca);


        switch (op) {
            case 0 -> {
                vendedor1.imprimirInventario();
                vendedor1.vender(heroi);
                do {
                    System.out.println("SIGA LÁ");
                    System.out.println("");
                    System.out.println("1 - SALA DE AULA");
                    System.out.println("2 - REUNIÃO PELO TEAMS");
                    System.out.print("RESPOSTA: ");
                    op = scanner.nextInt();
                } while (op != 1 && op != 2);// Repete o loop se a opção for inválida
                labirinto(op, heroi);  // Chama o método labirinto com os parametros da opção escolhida e o herói
            }
            case 1 -> {
                System.out.println("");
                System.out.println("                              SALA DE AULA                              ");
                System.out.println("CHEGASTE À SALA DE AULA.");
                System.out.println("VAIS TER TESTE DE POO MEU MENINO");
                p = (heroi.atacar(testePoo) == heroi);  // Verifica se o herói venceu a batalha contra testePoo
                if (p) {
                    heroi.usarPocao();
                    heroi.mostrarDetalhes();
                    System.out.println("ESCOLHE UMA OPÇÃOO: ");
                    System.out.println("2 - REUNIÃO PELO TEAMS");
                    System.out.println("3 - BAR DO IEFP");
                    System.out.print("RESPOSTA: ");
                    do {
                        op = scanner.nextInt();
                    } while (op != 2 && op != 3);
                    labirinto(op, heroi);
                } else {
                    reset("ACABOU A BRINCADEIRA, CHUMBASTE");  // Implementação do método reset
                }
            }
            case 2 -> {
                System.out.println( "                              REUNIÃO TEAMS                               ");
                System.out.println("");
                System.out.println("CHEGASTE À REUNIÃO PELO TEAMS, O PESSOAL TA A DIZER QUE TENS ATE AS 23.59 PARA ENTREGAR O RTABALHO DE UML");
                System.out.println("");
                p = (heroi.atacar(trabalhoUml) == heroi);
                if (p) {
                    heroi.usarPocao();
                    heroi.mostrarDetalhes();
                    labirinto(4, heroi);
                } else {
                    reset("ACABOU A BRINCADEIRA, CHUMBASTE");
                }
            }
            case 3 -> {
                System.out.println("SAFASTE-TE BEM");
                System.out.println("                              BAR DO IEFP                              ");
                heroi.mostrarDetalhes();
                System.out.println("");
                System.out.println("CHEGASTE AO BAR DO IEFP, QUE É QUE VAIS QUERER?");
                vendedor1.imprimirInventario();
                System.out.println("INSERE UM NÚMERO DE ACORDO COM O INVENTÁRIO OU 0 PARA NÃO COMPRAR NADA)");
                System.out.print("RESPOSTA: ");
                vendedor1.vender(heroi);
                labirinto(5, heroi);
            }
            case 4 -> {
                System.out.println("");
                System.out.println("                               ADEGA TÚNEL                              ");
                System.out.println("SAFASTE-TE BEM");
                System.out.println("");
                System.out.println("CHEGASTE À ADEGA TÚNEL, O TÁSSIO MANDOU FAZER UMA FRANCESINHA PARA TI");
                heroi.adicionarPocao(francesinha);
                System.out.println("ONDE VAMOS A SEGUIR?: ");
                System.out.println("5 - AULA");
                System.out.println("3 - BAR DO IEFP");
                System.out.print("RESPOSTA: ");
                do {
                    op = scanner.nextInt();
                } while (op != 5 && op != 3);
                labirinto(op, heroi);
            }
            case 5 -> {
                System.out.println("");
                System.out.println("                              AULA                              ");
                System.out.println("TENS AULA DE TARDE, QUE VAIS FAZER?");
                System.out.println("6 - APANHAR SOL");
                System.out.println("7 - FICAR REMOTE");
                System.out.print("RESPOSTA: ");
                do {
                    op = scanner.nextInt();
                } while (op != 6 && op != 7);
                labirinto(op, heroi);
            }
            case 6 -> {
                System.out.println("");
                System.out.println("                              APANHAR SOL                              ");
                System.out.println("");
                System.out.println("TAS TRANQUILO  A APANHAR SOL");
                System.out.println("");
                System.out.println("CHEGA O NOGUEIRA E DIZ QUE NÃO ENTREGASTE O CV E O LINKEDIN");
                p = (heroi.atacar(enviarCv) == heroi);
                if (p) {
                    heroi.usarPocao();
                    heroi.mostrarDetalhes();

                    System.out.println("ESCOLHE UMA OPÇÃO: ");
                    System.out.println("7 - REMOTE");
                    System.out.println("11 - SALA COMUM");
                    System.out.print("RESPOSTA: ");

                    do {
                        op = scanner.nextInt();
                    } while (op != 7 && op != 11);

                    labirinto(op, heroi);
                } else {
                    reset("ACABOU A BRINCADEIRA, CHUMBASTE");
                }
            }
            case 7 -> {
                System.out.println("");
                System.out.println("                              REMOTE                              ");
                System.out.println("ESTÁS REMOTE MAS É PARA ESTAR ATENTO");
                System.out.println("");
                System.out.println("NÃO ESTAVAS ATENTO, LEVAS FALTA DE ATENÇÃOM MENOS 15 DE VIDA ");
                heroi.setVida(heroi.getVida() - 15);
                heroi.mostrarDetalhes();
                heroi.usarPocao();
                System.out.println("QUE VAIS FAZER AMANHÃ?");
                System.out.println("");
                System.out.println("8 - CHEGAR A HORAS");
                System.out.println("9 - IR COM O MENDES AO CONTINENTE");
                System.out.print("RESPOSTA: ");
                do {
                    op = scanner.nextInt();
                } while (op != 8 && op != 9);
                labirinto(op, heroi);
            }
            case 8 -> {
                System.out.println("");
                System.out.println("                              CHEGAR A HORAS                              ");
                System.out.println("");
                System.out.println("ATÉ TÁ POUCO TRÂNSITO");
                System.out.println("");
                System.out.println("TXIII,MAS BATEU A RESSACA");
                p = (heroi.atacar(ressaca) == heroi);
                if (p) {
                    heroi.usarPocao();
                    heroi.mostrarDetalhes();
                    labirinto(10, heroi);
                } else {
                    reset("ACABOU A BRINCADEIRA, CHUMBASTE");
                }
            }
            case 9 -> {
                System.out.println("");
                System.out.println("                              CONTINENTE                              ");
                System.out.println("CHEGAMOS AO CONTINENTE, TÁ CÁ O MENDES A FAZER UM PIC NIC");
                System.out.println("");
                heroi.usarPocao();
                System.out.println("PASSA POR TI O MENDES E DIZ QUE TENS QUE ENTREGAR O POJECTO FINAL ATÉ ÀS 15:00");
                System.out.println("");
                p = (heroi.atacar(projectoFinal) == heroi);
                if (p) {
                    heroi.mostrarDetalhes();
                    reset("CONSEGUISTE, ACABASTE O CURSO E VAIS PARA ESTÁGIO RECEBER 10 k");
                } else {
                    reset("ACABOU A BRINCADEIRA, CHUMBASTE");
                }
            }
            case 10 -> {
                System.out.println("");
                System.out.println("                              SEGURNÇA                              ");
                System.out.println("SAFASTE-TE BEM");
                System.out.println("");
                heroi.mostrarDetalhes();
                System.out.println("CHEGASTE AO SEGURANÇA, TENS LÁ A MÁQUNA DA ÁQUA QQUE VENDE UMAS COISAS");
                System.out.println("");
                vendedor1.imprimirInventario();
                vendedor1.vender(heroi);
                labirinto(9, heroi);
            }
            case 11 -> {
                System.out.println("");
                System.out.println("                              SALA COMUM                              ");
                System.out.println("SAFASTE-TE BEM");
                heroi.mostrarDetalhes();
                System.out.println("");
                System.out.println("TAS COM SORTE, PODES IR À MÁQUINA COMPRAR QUALQUER COISA:");
                System.out.println("");
                vendedor1.imprimirInventario();
                vendedor1.vender(heroi);
                labirinto(9, heroi);
            }
        }
        return true;
    }

    /*------------------------------------------------ FIM DO JOGO----------------------------------------------------------------------------*/

    /*------------------------------------------------ INSTÂNCA DE CAVLEIRO----------------------------------------------------------------------------*/

    /**
     * Cria um novo cavaleiro com base nas informações fornecidas pelo usuário.
     *
     * @return o cavaleiro criado
     */
    public static Cavaleiro criarCavaleiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("QUAL É O TEU NOME?");
        System.out.print("RESPOSTA: ");
        String nome = scanner.nextLine();
        // Cria um novo Cavaleiro com o nome fornecido e valores iniciais para os atributos
        return new Cavaleiro(nome, 0, 0, 0, 0);
    }

    /*------------------------------------------------ INSTÂNCA DE FEITICEIRO----------------------------------------------------------------------------*/

    /**
     * Cria um novo feiticeiro com base nas informações fornecidas pelo usuário.
     *
     * @return o feiticeiro criado
     */
    public static Feiticeiro criarFeiticeiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("QUAL É O TEU NOME?");
        System.out.print("RESPOSTA: ");
        String nome = scanner.nextLine();
        // Cria um novo Feiticeiro com o nome fornecido e valores iniciais para os atributos
        return new Feiticeiro(nome, 0, 0, 0, 0);
    }

    /*------------------------------------------------ INSTÂNCA DE ARQUEIRO----------------------------------------------------------------------------*/

    /**
     * Cria um novo arqueiro com base nas informações fornecidas pelo usuário.
     *
     * @return o arqueiro criado
     */
    public static Arqueiro criarArqueiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("QUAL É O TEU NOME?");
        System.out.print("RESPOSTA: ");
        String nome = scanner.nextLine();
        // Cria um novo Arqueiro com o nome fornecido e valores iniciais para os atributos
        return new Arqueiro(nome, 0, 0, 0, 0);
    }
}