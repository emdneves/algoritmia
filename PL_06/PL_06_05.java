
/*5. Implemente um programa que contenha uma função com menu de opções que permitam invocar as funções desenvolvidas nos exercícios 1 a 3 (ou 4),
 devendo o número ser escolhido antes das opções do menu. */
import java.util.Scanner;

//////////

public class PL_06_05 {

    public static boolean par(int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean positivo(int num) {

        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean primo(int num) {

        if ((num % 2) == 0 && (num != 2)) {
            return false;
        } else if ((num % 3) == 0 && (num != 3)) {
            return false;
        } else if ((num % 5) == 0 && (num != 5)) {
            return false;
        } else if ((num % 7) == 0 && (num != 7)) {
            return false;
        } else {
            return true;
        }

    }

    public static boolean perfeito(int num) {

        int soma = 0;
        {
            for (int n = 1; n < num; n++)
                if (num % n == 0)
                    soma = soma + n;
        }
        if (soma == num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        // menu
        String op;
        Scanner input = new Scanner(System.in);

        do {

            // Ler número inteiro do utilizador
            System.out.print("Introduza um número: ");
            int num = input.nextInt();

            // getting option
            System.out.print("insert option:\n 1. par ou impar\n 2. positivo ou negativo\n 3. primo\n 4. perfeito");
            op = input.next();

            // menu de opções
            switch (op) {
                case "1":
                    // Invocar a função "par"
                    if (par(num)) {
                        System.out.println("é par");
                    } else {
                        System.out.println("não é par");
                    }
                    break;

                case "2":
                    // Invocar a função "positivo"
                    if (positivo(num)) {
                        System.out.println("positivo");
                    } else {
                        System.out.println("negativo");
                    }
                    break;

                case "3":
                    // Invocar a função "primo"

                    if (primo(num)) {
                        System.out.println("é primo");
                    } else {
                        System.out.println("não é primo");
                    }

                    break;
                case "4":
                    // Invocar a função "perfeito"
                    if (perfeito(num)) {
                        System.out.println("perfeito");
                    } else {
                        System.out.println("não é perfeito");
                    }
                    break;

                default:

            }
        } while (op.equals("1") || op.equals("2") || op.equals("3") || op.equals("4"));

        // closing the scanner
        input.close();
    }
}

// verificar se par
// verificar se negativo
// verificar se primo
// verificar se perfeito
