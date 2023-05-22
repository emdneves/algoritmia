package Entidades;

abstract class Entidade {

    private String nome;
    private int vida, forca;
    private String mainColor;
    private boolean adjustableSeatpost;

    public Entidade(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    abstract void mostrarDetalhes();
}
