public class Aluno {

    private String nome;
    private String curso;
    private int idade;
    private double media;

    public Aluno(String nome, int idade, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;
    }

    public boolean situacao() {
        if (this.media >= 9.5) {
            System.out.println("Aprovado");
            return true;
        } else {
            System.out.println("Reprovado");
            return false;
        }
    }
}
