package Itens;

// CHECK

import java.util.ArrayList;

/**
 * Classe abstrata que define o que será um item na generalidade e delega para as subclasses Arma e PocaoHP a definição das suas esecificidades
 */
public abstract class ItemHeroi {
    private String nome;
    private int preco;
    private ArrayList<TiposHeroi> tiposHeroi;

    /**
     * Construtor da classe ItemHeroi
     *
     * @param nome       nome do item.
     * @param preco      preço do item
     * @param tiposHeroi tipos de herói compatíveis com o item
     */
    public ItemHeroi(String nome, int preco, ArrayList<TiposHeroi> tiposHeroi) {
        this.nome = nome;
        this.preco = preco;
        this.tiposHeroi = tiposHeroi;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/


    /**
     * método abstrato que delega as subclasses a responsabilidade de definir o que deverão mostrar
     */
    public abstract void mostrarDetalhes();

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/


    /**
     * retorna uma String com o nome do item
     *
     * @return String com nome do item
     */
    public String getNome() {
        return nome;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * Retorna um int com o preço do item
     *
     * @return int com preço do item
     */
    public int getPreco() {
        return preco;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * retorna um ArrayList com os tipos de herói compatíveis com o item
     *
     * @return ArrayList com os tipos de herói compatíveis com o item
     */
    public ArrayList<TiposHeroi> getTiposHeroi() {
        return tiposHeroi;
    }

}