package Entidades;

public abstract class Entidade {
    protected String nome;
    protected int vida;
    protected int forca;

    public Entidade(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public abstract void mostrarDetalhes();
}
