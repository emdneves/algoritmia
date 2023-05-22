package Entidades;


abstract class Heroi {


    private String nivel;
    private int ouro;


    public Entidade(String nivel, int ouro, int forca) {
        this.nivel = nivel;
        this.ouro = ouro;
        this.forca = forca;
    }

    abstract void mostrarDetalhes();
}







}
