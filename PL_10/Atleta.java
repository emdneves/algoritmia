package PL_10;

public class Atleta {
    private String nome;
    private String modalidade;
    private String paisOrigem;
    private double altura;
    private double peso;

    public Atleta(String nome, String modalidade, String paisOrigem, double altura, double peso) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.paisOrigem = paisOrigem;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModalidade() {
        return this.modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getPaisOrigem() {
        return this.paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

