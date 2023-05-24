package TrabalhoPratico.Itens;

import java.util.ArrayList;

public class Arma extends ItemHeroi {
    private int ataque;

    //! --------------------------- Construtor ----------------------------------

    /**
     * Construtor da classe Arma.
     *
     * @param nome       O nome da arma.
     * @param precoOuro  O preço em ouro da arma.
     * @param tipoHeroi  A lista de tipos de heróis que podem usar a arma.
     * @param ataque     O valor do ataque da arma.
     */

    public Arma(String nome, int precoOuro, ArrayList<String> tipoHeroi, int ataque) {
        super(nome, precoOuro, tipoHeroi);
        this.ataque = ataque;
    }

    //! --------------------------- Metodos ----------------------------------

    /**
     * Exibe os detalhes da arma na consola.
     */

    @Override
    public void mostrarDetalhes() {

        System.out.println("");
        System.out.println("Detalhes da Arma");
        System.out.println("Nome: " + getNome());
        System.out.println("Preço em Ouro: " + getPrecoOuro());
        System.out.println("Tipos de Heróis: " + getTipoHeroi());
        System.out.println("Ataque: " + ataque);
        System.out.println("");

    }

    //! --------------------------- Getters e Setters ----------------------------------

    /**
     * Obtém o valor do ataque da arma.
     *
     * @return O valor do ataque da arma.
     */

    public int getAtaque() {
        return ataque;
    }

    /**
     * Define o valor do ataque da arma.
     *
     * @param ataque O valor do ataque da arma.
     */

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

}