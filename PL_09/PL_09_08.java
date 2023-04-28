/* 8. Crie uma classe Aluno que tenha os atributos nome, idade, curso e média. 
Crie um construtor que receba os quatro atributos como parâmetros. 
Crie um método chamado situacao que retorne "Aprovado" se a média for maior ou igual a 9.5, "Reprovado" caso contrário. 
No método main, crie um objeto dessa classe e apresente a situação do aluno.
 */import java.util.Scanner;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private int media;
    public Aluno(String nome, int idade, String curso, int media) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;
    }

    public String avaliacao() {
        if (media >= 9.5)
        {
        return "aprovado";
        }
        else
        {
        return "reprovado";
        }
    }

    public static void main(String[] args) {
        Aluno mendes = new Aluno("mendes", 30, "softdev", 20);
        Aluno tassio = new Aluno("tassio", 30, "softdev", 20);
        Aluno divino = new Aluno("divino", 2, "openai", 1);


        System.out.println("o tassio está " + tassio.avaliacao());
        System.out.println("o mendes está " + mendes.avaliacao());
        System.out.println("o divino está " + divino.avaliacao());


    }
}
