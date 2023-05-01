import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
class Main {

    public static int lerFicheiro(File x) throws FileNotFoundException {
       Scanner in = new Scanner(new File(x.toURI()));

       String linha = in.nextLine();
       int sum=0;

       while (in.hasNextLine()){

           linha = in.nextLine();
           sum++;

      }

        in.close();
        return sum;
    }

    public static String[][] splitFicheiro(File x) throws FileNotFoundException{

        Scanner in = new Scanner(new File(x.toURI()));

        int size = lerFicheiro(x);
        String[] div = new String[9];

        int i=0;

        String linha = in.nextLine();
        String[][] dados = new String[size][9];

        while (in.hasNextLine()) {

            linha = in.nextLine();
            div = linha.split(";");

            dados[i][0]=div[0];  // guarda idVenda
            dados[i][1]=div[1];  // guarda idCliente
            dados[i][2]=div[2];  // nomeCliente
            dados[i][3]=div[3]; // contacto
            dados[i][4]=div[4]; // email
            dados[i][5]=div[5]; // editora
            dados[i][6]=div[6]; // categoria
            dados[i][7]=div[7]; // jogo
            dados[i][8]=div[8]; // valor

            i++;
        }
        return dados;
    }
    public static void print(String[][] dados) { //Op1

        for (int i = 0; i < dados.length; i++) {
            System.out.print("\n");

            for (int x = 0; x < dados[0].length; x++) {
                System.out.print(dados[i][x] + " ; ");

            }
        }
    }
    public static double vendasFicheiro(String[][] x, boolean val){ //op2

        int sum = 0;
        double num, total = 0;

            for (int j = 0; j < x.length; j++) {
                num = Double.parseDouble(x[j][8]);

                total += num;
                sum++;
            }
        if (val) {
            System.out.println("\nNumero total de vendas: " + sum);
            System.out.printf("Valor Total : %,.2f€", total );
        }
        return total;
    }

    public static void lucro(double x){ //op3

        double lucro = x * 0.1;
        System.out.printf("O valor total de lucro é %,.2f€", lucro );

    }

    public static void infoCliente(String[][] x){
        Scanner in = new Scanner(System.in);

            boolean stop = false;

        do {

            try {
                int id=0, i = 0;
                System.out.print("\nPor favor, introduza Id do cliente: ");

                int op = in.nextInt();


                while (!stop && i < x.length) {

                    id = Integer.parseInt(x[i][1]);

                    if (id == op) {

                        System.out.println("\nNome: " + x[i][2] + "\nContacto: " + x[i][3] + "\nEmail: " + x[i][4]);

                        stop = true;
                    }

                    i++;
                }

                if (!stop){
                    System.out.println("Id desconhecido");
                }

            } catch (InputMismatchException exc) {
                System.out.println("Id inválido, tem de ser numérico!");
                in.next();
            }

        }while (!stop);
    }
    public static void editora(String[][] x) { //op5

        Scanner input = new Scanner(System.in);

        String genero = "", jogo ="", resp, editora;
        String[] categorias = new String[10];
        String[] jogos = new String[10];
        boolean verEdi= false;

        do {

            System.out.print("\nInsira a editora a consultar: ");
            editora = input.nextLine();

            System.out.println("\n---Categorias e Jogos da " + editora + "---");

            for (int i = 0; i < x.length; i++) {

                if (x[i][5].equals(editora)) {
                    genero = x[i][6];
                    jogo = x[i][7];
                    verEdi = true;

                    boolean verCateg = false;
                    int j = 0;

                    while (!verCateg) {

                        if (categorias[j] == null) {
                            categorias[j] = genero;
                            System.out.println("\n" + categorias[j] + ":");

                        } else if (categorias[j].equals(genero)) {
                            verCateg = true;

                        } else {
                            j++;
                        }
                    }
                    int k = 0;
                    boolean verJog = false;

                    while (!verJog) {

                        if (jogos[k] == null) {
                            jogos[k] = jogo;
                            System.out.println(jogo);

                        } else if (jogos[k].equals(jogo)) {
                            verJog = true;

                        } else {
                            k++;
                        }
                    }
                }
            }
            if (!verEdi) {
                System.out.println("\nEssa Editora não está no Sistema ou tem erro Ortográfico!");
                System.out.println("Deseja tentar de novo? (s/n)");
                resp = input.next();

                if (resp.equals("s")){

                    input.nextLine();

                } else {
                    verEdi = true;
                }
            }
        }while (!verEdi);
    }


    public static void jogoMaiorValor(String[][] x) { //op6
        double maior = 0;

        System.out.println("\nAs vendas mais caras foram: ");
        for (int j = 0; j < x.length; j++) {
            double valor = Double.parseDouble(x[j][8]);
            if (valor > maior) {
                maior = valor;
            }
        }

        for (int i = 0; i < x.length; i++) {
            double comp = Double.parseDouble(x[i][8]);
            String nome = x[i][2], jogo = x[i][7];
            if (comp == maior) {
                System.out.println(jogo + " - " + maior + "€ | comprado por: " + nome);
            }
        }

    }
    public static void menu(File x) throws FileNotFoundException {
            Scanner in = new Scanner(new File(x.toURI()));
            Scanner input = new Scanner(System.in);

            int opcao=0;
            String[][] dados = splitFicheiro(x);

            do {

                System.out.println("\n\nPor favor, escolha a opção pretendida: \n");
                System.out.println("1 - Imprimir ficheiro\n2 - Quantidade e Total de vendas\n3 - Lucros\n4 - Ver dados de Cliente\n5 - Generos e Jogos da editora\n6 - Ver jogo mais caro\n7 - Sair");
                System.out.print("\n-> ");

                try {

                    opcao = input.nextInt();

                    switch (opcao){

                        case 1: print(dados);
                        break;

                        case 2: vendasFicheiro(dados, true);

                        break;

                        case 3: lucro(vendasFicheiro(dados, false));
                        break;

                        case 4: infoCliente(dados);
                            break;

                        case 5: editora(dados);
                            break;

                        case 6: jogoMaiorValor(dados);
                            break;

                        case 7: break;

                        default:
                            System.out.println("Opção inválida!");
                    }

                } catch (InputMismatchException exc) {

                    System.out.println("Opção inválida!");
                    input.next();

                }

            } while (opcao != 7);

            in.close();

        }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        try {
            File ficheiro = new File("GameStart.csv");
            menu(ficheiro);

        } catch (FileNotFoundException exc){

            System.out.print("Not found");
        }

    }
}