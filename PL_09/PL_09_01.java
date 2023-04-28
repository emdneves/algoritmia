/* 1. Escreva um programa onde cria uma classe chamada "Pessoa" com um atributo de nome, idade e altura. 
Crie duas instâncias da classe "Pessoa", defina os seus atributos usando o construtor e imprima seu nome, idade e altura. */

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("mendez", 25, 1.70);
        Pessoa pessoa2 = new Pessoa("tassio", 31, 1.85);

        System.out.println("Pessoa 1 - Nome: " + pessoa1.getNome() + ", Idade: " + pessoa1.getIdade() + ", Altura: " + pessoa1.getAltura());
        System.out.println("Pessoa 2 - Nome: " + pessoa2.getNome() + ", Idade: " + pessoa2.getIdade() + ", Altura: " + pessoa2.getAltura());
    }
}
