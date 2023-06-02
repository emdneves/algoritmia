/* 15. Escreva uma função que recebe uma string como parâmetro e retorna o número de ocorrências da letra 'a' (minúscula) na string. */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o texto: ");
        String str = input.nextLine();
        input.close();
        int count = ocorrencias(str, 'a');
        System.out.println("O número de ocorrências da letra a é : " + count);
    }

    public static int ocorrencias(String str, char c) {
        int count = 0;
        String[] arr = str.split("");
        for (String s : arr) {
            if (s.equals(String.valueOf(c))) {
                count++;
            }
        }
        return count;
    }
}