/* 4. Escreva um programa onde cria uma classe chamada "Circulo" com um atributo raio. 
Deve ser possível aceder e modificar esse atributo. Calcule a área e a circunferência do círculo.
 */
import java.util.Scanner;

public class Circulo {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public double getAreaCirculo() {
        double area = 3.14 * (raio * raio);
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Introduza o raio: ");
        int raio = input.nextInt();

        Circulo circulo1 = new Circulo(raio);
        System.out.println("A área do círculo é: " + circulo1.getAreaCirculo());

        input.close(); 
    }
}
