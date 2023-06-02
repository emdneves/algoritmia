package Entidades;

// CHECK

import java.util.ArrayList;
import java.util.Scanner;

import Itens.Arma;
import Itens.PocaoHP;

/**
 * Classe abstracta Heroi que define um Herio no jogo e delega para as suas subclasses a especificação do tipo de herói
 */
public abstract class Heroi extends Entidade {
    private int nivel;
    private int ouro;
    private Arma arma;
    private ArrayList<PocaoHP> pocoes;

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/


    /**
     * Construtor da classe Heroi, que herda da superclasse Entidade os parâmetros nome, vida e força o nível e ouro
     *
     * @param nome  nome do herói
     * @param vida vida do herói
     * @param forca força do herói
     * @param nivel nível do herói
     * @param ouro  quantidade de ouro do herói
     */
    public Heroi(String nome, int vida, int forca, int nivel, int ouro) {
        super(nome, vida, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.pocoes = new ArrayList<PocaoHP>();
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/


    /**
     *  método abstrato que delega as subclasses a responsabilidade de atacar às suas subclasses
     *
     * @param npc enimigo a atacar
     * @return retorna a entidade vencedora do combate
     */
    public abstract Entidade atacar(NPC npc);

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * método que adiciona uma poção ao ArrayList das poções do herói
     *
     * @param pocao poção a adicionar
     */
    public void adicionarPocao(PocaoHP pocao) {  // MÉTODO NÃO PEDIDO NO ENUNCIADO
        this.pocoes.add(pocao);
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/


    /**
     * método para subtrair o valor de ouro correspondente à compra de um item
     *
     * @param quantidade quantidade de ouro a ser subtraida
     */
    public void decrementarOuro(int quantidade) {
        ouro -= quantidade;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/


    /**
     * método para uso da poção
     */
    public void usarPocao() {
        if (this.pocoes.size() > 0) {
            Scanner scanner = new Scanner(System.in);
            int i = 0;
            System.out.print("\n----------------------\n");
            for (PocaoHP pocao : pocoes) {
                System.out.print((++i) + " - " + pocao.getNome() + " (" + pocao.getCurar() + ")\n");
            }
            System.out.print("----------------------\n");

            do {
                System.out.print("");
                System.out.println("INSERE O NÚMERO DA POÇÃO QUE QUERES USAR OU ZERO PARA GUARDA-LA");
                System.out.print("Resposta: ");
                i = scanner.nextInt();
            } while (i < 0 || i > pocoes.size());

            if (i > 0) {
                i--;
                aumentarVida(pocoes.get(i).getCurar());

                System.out.println("USASTE " + pocoes.get(i).getNome() + " E RECEBESTE DE VIDA:  " + pocoes.get(i).getCurar());
                pocoes.remove(i);
                System.out.println("A TUA VIDA DEPOIS DA POÇÃO É: " + getVida());
            }
        } else {
            System.out.println("SEM POÇÃO");
        }
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * método para aumentar a vida do herói, usado no método usarPoaco
     *
     * @param quantidade quantidade de vida a aumentar
     */
    public void aumentarVida(int quantidade) {
        setVida(getVida() + quantidade);
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/


    /**
     * método para subtrair vida ao herói
     *
     * @param quantidade quantidade de vida a subtrair
     */
    public void subtrairVida(int quantidade) {  // metodo chamado nos herois em si que recebem danos NPC
        setVida(getVida() - quantidade);
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/


    /**
     * método para aumentar a força do herói
     *
     * @param quantidade quantidade de força a aumentar
     */
    public void aumentarForca(int quantidade) {
        setForca(getForca() + quantidade);
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/


    /**
     * método para aumentar a nível do herói
     */
    public void subirNivel() {
        nivel++;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/


    /**
     * método para aumentar o ouro do herói
     *
     * @param quantidade quantidade de ouro a ser aumentada
     */
    public void aumentarOuro(int quantidade) {
        ouro += quantidade;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/


    /**
     * obtém o nível actual do herói
     *
     * @return nível actual do herói
     */
    public int getNivel() {
        return nivel;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/


    /**
     * obtém a quantidade disponível actual de ouro para o herói
     *
     * @return quantidade disponível actual de ouro para o herói
     */
    public int getOuro() {
        return ouro;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * define a quantidade actual de ouro do herói
     *
     * @param ouro quantidade actual de ouro do herói
     */
    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * obtém a arma disponível do herói
     *
     * @return arma actual do herói
     */
    public Arma getArma() {
        return arma;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * define a arma actual do herói
     *
     * @param arma nova arma actual do herói
     */
    public void setArma(Arma arma) {
        this.arma = arma;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * obtém a lista de poções disponíveis para o herói
     *
     * @return lista de poções disponíveis para o herói
     */
    public ArrayList<PocaoHP> getPocoes() {
        return pocoes;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

}