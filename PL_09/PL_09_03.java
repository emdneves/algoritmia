/* 3. Escreva um programa onde cria uma classe chamada "Retângulo" com atributos de largura e altura. 
Calcule a área e o perímetro do retângulo.
 */
public class Rectangulo {
    private int largura;
    private int altura;

    public Rectangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public int getArea() {
        int area = largura * altura;
        return area;
    }

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(2, 3);
        System.out.println("a área do rectangulo é: " + rectangulo1.getArea());
    }
}