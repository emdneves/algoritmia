package Itens;

import java.util.ArrayList;

/**
 * Classe arma que define uma poção que permite aumentar a vida do herói - deriva de ItemHeroi
 */
public class PocaoHP extends ItemHeroi {

    private int curar;

    /**
     * Construtor da classe PocaoHP, que herda da superclasse ItemHeroi os parâmetros nome, preco e tiposHeroi e lhe adiciona a cura
     *
     * @param nome       nome da poção
     * @param preco      preço da poção
     * @param tiposHeroi tipos de herói compatíveis com a poção
     * @param curar     valor de cura da poção
     */
    public PocaoHP(String nome, int preco, ArrayList<TiposHeroi> tiposHeroi, int curar) {
        super(nome, preco, tiposHeroi);
        this.curar = curar;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * método void, que serve apenas para imprimir os detalhes da poção, método delegado pela sua superclasse ItemHeroi
     */
    @Override
    public void mostrarDetalhes() {
        System.out.print("NOME: " + getNome() + " | ");
        System.out.print("PREÇO: " + getPreco() + " | ");
        System.out.print("CURA: " + getCurar());
        System.out.println();
    }


    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * Retorna um int com valor de cura da poção
     *
     * @return int com valor de cura da poção
     */
    public int getCurar() {
        return curar;
    }
}