import java.util.Scanner;


public class PL_09_04 {
    public PL_09_04() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circulo circunferencia = new Circulo(0.0);

        String escolha;
        do {
            System.out.print("Introduza um raio: ");
            double raio = input.nextDouble();
            circunferencia.setRaio(raio);
            System.out.println("Raio: " + circunferencia.getRaio());
            System.out.println("Diametro: " + circunferencia.diametro());
            System.out.println("Circunferencia/Perimetro: " + circunferencia.circunferencia());
            System.out.println("Área: " + circunferencia.areaCirculo());
            System.out.println("Deseja alterar o raio? (s/n):");
            escolha = input.next();
        } while(!escolha.equals("n"));

    }
}
