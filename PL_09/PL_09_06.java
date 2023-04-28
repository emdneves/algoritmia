
/* 6. Crie uma classe chamada "Calculadora" com métodos para adição, subtração, multiplicação e divisão. 
De seguida, crie um objeto dessa classe e use os métodos para realizar algumas operações matemáticas.
 */
import java.util.Scanner;

public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getSum() {
        return num1 + num2;
    }

    public int getSub() {
        return num1 - num2;
    }

    public int getMul() {
        return num1 * num2;
    }

    public int getDiv() {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o numero 1: ");
        int num1 = input.nextInt();

        System.out.print("Introduza o numero 2: ");
        int num2 = input.nextInt();

        System.out.print("Escolha a operação:\n 1 - Soma\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão\n" );
        int opcao = input.nextInt();

        Calculadora calculadora1 = new Calculadora(num1, num2);

        switch (opcao) {
            case 1:
                System.out.println("A soma dos números é: " + calculadora1.getSum());
                break;
            case 2:
                System.out.println("A subtração dos números é: " + calculadora1.getSub());
                break;
            case 3:
                System.out.println("A multiplicação dos números é: " + calculadora1.getMul());
                break;
            case 4:
                System.out.println("A divisão dos números é: " + calculadora1.getDiv());
                break;
            default:
                System.out.println("Opção inválida.");
        }

        input.close();
    }
}