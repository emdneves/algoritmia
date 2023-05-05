public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularPerimetro() {
        double perimetro = this.largura * 2.0 + this.altura * 2.0;
        return perimetro;
    }

    public double calcularArea() {
        return this.largura * this.altura;
    }
}
