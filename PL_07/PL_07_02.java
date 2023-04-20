/* Escreva uma função que recebe uma String como parâmetro e retorna verdadeiro se essa String contém apenas letras maiúsculas e falso se contém outros caracteres.

 */import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        boolean contemApenasMaiusculas = contemApenasMaiusculas(input);
        System.out.println("Contém apenas letras maiúsculas? " + contemApenasMaiusculas);
    }

    public static boolean contemApenasMaiusculas(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int charValue = (int) chars[i];
            if (charValue < 65 || charValue > 90) {
                return false;
            }
        }
        return true;
    }
}
