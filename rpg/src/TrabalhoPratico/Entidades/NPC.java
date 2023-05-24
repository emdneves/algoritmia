package TrabalhoPratico.Entidades;


import TrabalhoPratico.Entidades.Entidade;

public class NPC extends Entidade {

    //! --------------------------- Construtor ----------------------------------

    public NPC(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }

    //! --------------------------- Metodos ----------------------------------

    @Override
    public void mostrarDetalhes() {

        System.out.println("");
        System.out.println("Detalhes do NPC");
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Força: " + getForca());
        System.out.println("");

    }
}