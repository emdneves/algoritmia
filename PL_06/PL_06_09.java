import java.util.Scanner;

public class Main {

    // função "crescente"
    public static boolean getInc(int[] arr) {
        int inc = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < inc) {
                inc = arr[i];
                count = 1;
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    // função "maior"
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // função "menor"
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // função menu de opções que permitam invocar as funções desenvolvidas nos
    // exercícios 6 a 8
    public static void menuOP(int[] list) {
        Scanner input = new Scanner(System.in);
        int op;
        do {
            // mostrando opções
            System.out.print("Escolha uma opção:\n 1. Maior\n 2. Menor\n 3. Crescente\n 4. Sair\n");
            op = input.nextInt();

            switch (op) {
                case 1:
                    // invocando a função "maior"
                    System.out.println("O maior elemento é: " + getMax(list));
                    break;

                case 2:
                    // invocando a função "menor"
                    System.out.println("O menor elemento é: " + getMin(list));
                    break;

                case 3:
                    // invocando a função "crescente"
                    if (getInc(list)) {
                        System.out.println("O array está em ordem crescente.");
                    } else {
                        System.out.println("O array não está em ordem crescente.");
                    }
                    break;

                case 4:
                    // encerrando o programa
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (op != 4);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do array:");
        int size = input.nextInt();
        int[] list = new int[size];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }
// closing the scanner
input.close();

        menuOP(list);
    }
}
