import java.util.Scanner;

public class PL_09_10 {
    public PL_09_10() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Funcionario vitor = new Funcionario("Vitor Santos", 1000.0, "Formação");
        vitor.exibirDados();
        System.out.println();
        System.out.print("Percentagem de Aumento: ");
        double aumento = input.nextDouble();
        vitor.aumentarSalario(aumento);
        System.out.println();
        vitor.exibirDados();
    }
}