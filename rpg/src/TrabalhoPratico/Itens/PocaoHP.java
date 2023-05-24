package TrabalhoPratico.Itens;
import TrabalhoPratico.Itens.ItemHeroi;

import java.util.ArrayList;

public class PocaoHP extends ItemHeroi {
    private int vidaCurar;

    //! --------------------------- Construtor ----------------------------------

    /**
     * Construtor da classe PocaoHP.
     *
     * @param nome       O nome da poção de HP.
     * @param precoOuro  O preço em ouro da poção de HP.
     * @param tipoHeroi  A lista de tipos de heróis que podem usar a poção de HP.
     * @param vidaCurar  A quantidade de vida a curar da poção de HP.
     */

    public PocaoHP(String nome, int precoOuro, ArrayList<String> tipoHeroi, int vidaCurar) {
        super(nome, precoOuro, tipoHeroi);
        this.vidaCurar = vidaCurar;
    }

    //! --------------------------- Metodos ----------------------------------

    /**
     * Exibe os detalhes da PoçaoHP na consola.
     */

    @Override
    public void mostrarDetalhes() {

        System.out.println("");
        System.out.println("Detalhes da Poção de HP");
        System.out.println("Nome: " + getNome());
        System.out.println("Preço em Ouro: " + getPrecoOuro());
        System.out.println("Tipos de Heróis: " + getTipoHeroi());
        System.out.println("Vida a Curar: " + vidaCurar);
        System.out.println("");

    }

    /**
     * Obtém a quantidade de vida a curar da poção de HP.
     *
     * @return A quantidade de vida a curar da poção de HP.
     */

    public int getVidaCurar() {
        return vidaCurar;
    }


    /**
     * Define a quantidade de vida a curar da poção de HP.
     *
     * @param vidaCurar A quantidade de vida a curar da poção de HP.
     */

    public void setVidaCurar(int vidaCurar) {
        this.vidaCurar = vidaCurar;
    }


//! --------------------------- Getters e Setters ----------------------------------

}