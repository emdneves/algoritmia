
// Crie um jogo, que peça ao jogador 1 um valor entre 0 e 100. De seguida, deverá permitir ao jogador 2 tentar acertar no valor inserido pelo jogador 1. 
// A cada iteração, enquanto o valor não for descoberto, deverá informar se o valor introduzido pelo jogador 2 é inferior ou superior ao valor inserido pelo jogador 1. 
// No final (quando o valor é descoberto) deverá apresentar o número de tentativas que o jogador 2 necessitou para acertar.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 0;

        // getting option
        int player1, player2;

        System.out.print("value between 0 and 100: ");
        player1 = input.nextInt();
        do {
            System.out.print("value between 0 and 100: ");
            player2 = input.nextInt();
            if (player1 < player2) {
                System.out.println("1 is smaller");
            } else {
                System.out.println("1 is bigger");
            }
            count++;
        } while (player1 != player2);
        System.out.print("took you" + count + " tries!");
    }
}