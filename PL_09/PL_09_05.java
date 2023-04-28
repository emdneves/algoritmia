/* 5. Crie uma classe chamada "Carro" com os seguintes atributos: marca, modelo e ano de fabrico. 
Em seguida, crie um método na classe "Carro" chamado "ligar" que exibe a mensagem "O carro está ligado". 
De seguida, crie um objeto da classe "Carro" e invoque o método "ligar".
 */
public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrico;

    public Carro(String marca, String modelo, int anoFabrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
    }

    public void ligar() {
        System.out.println("O carro está ligado");
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Mercedes", "A45", 2021);
        meuCarro.ligar();
    }
}

