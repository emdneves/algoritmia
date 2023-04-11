import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);

        /* pedir número de quarto, usamos uma int para impedir que sejam inserido valores inválidos, com a int asseguramos que será um número inteiro, caso contrario o programa pára.
        poderiamos imprimir erro caso nao fosse uma int, usando um hasInt, mas nao foi dado na aula, portanto nao vou usar 
        Para resolver a questão dos inteiros egativos atentar no comentário seguinte.*/
        System.out.println("inserir número do quarto: ");
        int quarto = input.nextInt();

        //sair do programa caso seja inserido no número de quarto um valor negativo
        if(quarto < 0)
        {
            System.out.println("Erro no número de quarto, o número de quarto deverá ser um inteiro de 1 a infinito.");
            System.exit(0); 
        }

        // pedir número de dias, ao definirmos a variável "dias"como inteiro, já estamos a aseegurar que o valor introduzido terá que ser um inteiro
        System.out.println("inserir número de dias, entre 1 e 365: ");
        int dias = input.nextInt();

        //sair do programa caso o valor fosse superior a 365. Podiamos usar um ciclo que voltava a perguntar, mas conforme indicado, apliquei só até às condicinais ( fui ver a net como se saia do programa)
        if(dias > 365 || dias < 1)
        {
            System.out.println("Erro no número de dias! O número de ds deverá ser um valor inteiro entre 1 e 365 inclusive.");
            System.exit(0); 
        }

        // pedir tipo de quarto
        System.out.println("inserir tipo de quarto, I para individual, D para duplo, T para triplo ou S para suite: ");
        String tipo = input.next();

        //sair do programa caso o tipo de quarto seja diferente de I, D, T ou S. Podiamos usar um ciclo que voltava a perguntar, mas conforme indicado, apliquei só até às condicinais
        if(!tipo.equals("I") && !tipo.equals("D") && !tipo.equals("T") && !tipo.equals("S"))
        {
            System.out.println("Erro no tipo de quarto! Deve ser introduzido I para individual, D para duplo, T para triplo, ou S para suite");
            System.exit(0); //sair do programa ( fui ver a net como se saia do programa)
        }

        // fecho do scanner, a partir daqui deixará de ser necessário, assim optimizamos o programa ao máximo
        input.close();

        // declaração e inicialização das variáveis que vão depender do tipo de quarto, para poupar memória usam-se doubles qaundo estritamente necessário
        int limpeza = 0, custo = 0;
        double imposto;

        /* declaração das variáveis para cada tipo de quarto, assim passamos a ter a variável com o respectivo valor para cada quarto e usamos apenas uma
        variável, alterando-lhe o valor em função do tipo de quarto, fazendo as operações no final, uma vez apuradas todas as condicionantes, apesar de tambem 
        podermos colocar as operações dentro do case, parece-me mais eficiente deste modo e facilmente editável. Também alteramos o valor da variável "tipo" para que na impressão final seja possível apresentar o tipo de quarto*/
        switch (tipo) 
        {
            case "I":
                custo = 200;
                limpeza = 25;
                tipo = ("individual");
                break;
            case "D":
                custo = 250;
                limpeza = 30;
                tipo = ("duplo");
                break;
            case "T":
                custo = 275;
                limpeza = 30;
                tipo = ("triplo");
                break;
            case "S":
                custo = 300;
                limpeza = 50;
                tipo = ("suite");
                break;
            default:
                System.out.println("erro ");
        }
        // calculo do valor liquido
        double liquido = dias * custo;
        // calculo do valor da limpeza
        double custo_limpeza = dias * limpeza;

        /*vamos ja imprimir o valor liquido porque abaixo vai assumir um valor diferente quando lhe forem descontados os valores de impostos e limpeza e
        assim temos menos uma variável */
        System.out.println("valor bruto a receber pelas reservas totais do quarto tipo " + tipo + " número " + quarto + ":\n" + liquido + " euros");

        // tal como acima, usamos apenas uma variável, "imposto" cujo valor sera alterado em função do lucro e passrá a assumir o valor correspondentes nas operações em diante
        if (liquido - custo_limpeza <= 20000) 
        {
            imposto = 0.23;
        } 
        else if (liquido - custo_limpeza <= 50000) // não é necessário verificar a condição menor que porque já é verificada no primeiro if, poupando-se uma operação
        {
            imposto = 0.25;
        } 
        else 
        {
            imposto = 0.28;
        }
        // para aferirmos em que escalão se enquadra a operação, imprimimos a taxa na qual a mesma se enquadra
        System.out.println("imposto: " + imposto * 100 + "%");
        /* so levamos ate ao fim as variaveis que são usadas para operações (e no caso do cliente querer alterar, só terá que alterar num sítio, dentro do if ou dentro do case) e as variáveis que vão ser usadas para impressão, 
        e ao irmos atribuindo valores às variaveis consoante o seu enquadramento vamos reciclando-as */

        // calculo do imposto, reciclando a variavel imposto que ate aqui assumia o valor percentual (taxa), e a partir daqu assume o valor em euros de imposto
        imposto = ((liquido - custo_limpeza) * imposto);
        // calculo do valor liquido, reciclando a variavel inicial liquido
        liquido = liquido - custo_limpeza - imposto;

        // impressao de todos os valores pedidos no enunciado
        System.out.println("total do custo da limpeza do quarto tipo " + tipo + " número " + quarto + ":\n" + custo_limpeza + " euros");
        System.out.println("valor de descontos fiscais a entregar ao estado pelo quarto do tipo " + tipo + " número "  + quarto + ":\n" + imposto + " euros");
        System.out.println("valor líquido a receber pelo quarto do tipo " + tipo + " número "  + quarto + ":\n" + liquido + " euros");

    }
}