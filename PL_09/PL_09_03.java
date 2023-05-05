import java.util.Scanner;


public class PL_09_03 {


    public PL_09_03() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo fixo = new Retangulo(10.5, 50.0);
        System.out.print("Insira a largura:");
        double largura = input.nextDouble();
        System.out.print("Insira a altura:");
        double altura = input.nextDouble();
        Retangulo variavel = new Retangulo(largura, altura);
        System.out.println("Perímetro: " + variavel.calcularPerimetro());
        System.out.println("Área: " + variavel.calcularArea());
        if (fixo.calcularArea() > variavel.calcularArea()) {
            System.out.println("O retangulo fixo é maior");
        } else {
            System.out.println("O retangulo do utilizador é maior");
        }

    }
}