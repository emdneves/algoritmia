import java.util.Scanner;

public class PL_09_05 {
    public PL_09_05() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira a marca: ");
        String marca = input.next();
        System.out.print("Insira a modelo: ");
        String modelo = input.next();
        System.out.print("Insira o ano de fabrico: ");
        int ano = input.nextInt();
        Carro carroUtilizador = new Carro(marca, modelo, ano);
        System.out.print("Deseja ligar o carro? (s/n): ");
        String escolha = input.next();
        if (escolha.equals("s")) {
            carroUtilizador.ligar();
        }

    }
}