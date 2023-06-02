package Itens;

// CHECK

import java.util.ArrayList;

/**
 * Classe arma que define uma arma - deriva de ItemHeroi
 */
public class Arma extends ItemHeroi {
    private int ataque;

    /**
     * Construtor da classe Arma, que herda da superclasse ItemHeroi os parâmetros nome, preco e tiposHeroi e lhe adiciona o ataque
     *
     * @param nome       nome da arma
     * @param preco      preço da arma
     * @param tiposHeroi tipos de herói compatíveis com a arma
     * @param ataque     valor de ataque da arma.
     */
    public Arma(String nome, int preco, ArrayList<TiposHeroi> tiposHeroi, int ataque) {
        super(nome, preco, tiposHeroi);
        this.ataque = ataque;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/


    /**
     * Retorna um int com valor de ataque da arma
     *
     * @return int com valor de ataque da arma
     */
    public int getAtaque() {
        return ataque;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/


    /**
     * método void, que serve apenas para imprimir os detalhes da arma, método delegado pela sua superclasse ItemHeroi
     */
    @Override
    public void mostrarDetalhes() {
        System.out.print("NOME: " + getNome() + " | ");
        System.out.print("PREÇO: " + getPreco() + "  | ");
        System.out.print("HERÓIS COMPATÍVEIS: " + getTiposHeroi() + " | ");
        System.out.print("ATAQUE: " + getAtaque());
        System.out.println();
    }
}