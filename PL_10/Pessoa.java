package PL_10;

public class Pessoa {
    private String nome;
    private String email;
    private String telemovel;
    private int idade;

    public Pessoa(String nome, String email, String telemovel, int idade) {
        this.nome = nome;
        this.email = email;
        this.telemovel = telemovel;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelemovel() {
        return this.telemovel;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
