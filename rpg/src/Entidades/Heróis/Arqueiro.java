package Entidades.Heróis;

import Entidades.Entidade;
import Entidades.Heroi;
import Entidades.NPC;
import Itens.PocaoHP;

/**
 * Classe Arqueiro que define um Arqueiro - deriva de Heroi que por sua vez deriva de Entidade
 */
public class Arqueiro extends Heroi {

    /**
     * Construtor da classe Arqueiro, que herda da superclasse Heroi os parâmetros nome, vida, força, nível e ouro
     *
     * @param nome  nome do Arqueiro
     * @param vida  quantidade de vida do Arqueiro
     * @param forca força do Arqueiro
     * @param nivel nível do Arqueiro
     * @param ouro  quantidade de ouro do Arqueiro
     */
    public Arqueiro(String nome, int vida, int forca, int nivel, int ouro) {
        super(nome, vida, forca, nivel, ouro);
    }
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * método que representa um ataque de um herói a um NPC, aplicado à especificidade da classe Arqueiro
     *
     * @param npc NPC a atacar
     * @return retorna a entidade vencedora do combate
     */
    @Override
    public Entidade atacar(NPC npc) {

        System.out.println(this.getNome() + " VS " + npc.getNome());

        boolean existeArma = true;

        // Verifica se o herói possui uma arma equipada
        if (this.getArma() == null) {
            existeArma = false;
        }

        // Verifica se o herói possui uma arma
        if (existeArma) {
            // O combate continua enquanto o herói e o NPC tiverem vida
            while (this.getVida() > 0 && npc.getVida() > 0) {
                // Calcula o dano causado pelo herói, considerando a sua força e o ataque da arma
                int danoHeroi = this.getForca() + this.getArma().getAtaque();
                npc.setVida(npc.getVida() - danoHeroi);
                System.out.println(npc.getNome() + " : " + npc.getVida());

                // Verifica se o NPC foi derrotado
                if (npc.getVida() <= 0) {
                    // O herói sobe de nível, aumentanbdo a sua vida, força e GP
                    this.subirNivel();
                    this.aumentarVida(10);
                    this.aumentarForca(1);
                    this.aumentarOuro(10);
                } else {
                    // Caso o NPC ainda esteja vivo, ele ataca
                    // Calcula o dano causado pelo NPC, considerando a sua força multiplicada por 1.1
                    int danoInimigo = (int) (npc.getForca() * 1.1);
                    this.subtrairVida(danoInimigo);
                    System.out.println("A TUA VIDA É: " + this.getVida());
                }
            }
        }

        // Verifica o resultado do combate
        if (npc.getVida() <= 0 && existeArma) {

            System.out.println("");
            System.out.println("--------------------");
            System.out.println("PASSASTE ESTA PROVA");
            System.out.println("--------------------");
            return this;
        } else {

            System.out.println("");
            System.out.println("--------------------");
            System.out.println("CHUMBASTE");
            System.out.println("--------------------");
            return npc;
        }
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * método void, que serve apenas para imprimir os detalhes do Arqueiro, método delegado pela sua superclasse Heroi
     */
    @Override
    public void mostrarDetalhes() {

        System.out.println("");

        // Imprime os detalhes do arqueiro
        System.out.print("ARQUEIRO    " + " | ");
        System.out.print("NOME: " + getNome() + " | ");
        System.out.print("VIDA: " + getVida() + " | ");
        System.out.print("FORÇA: " + getForca() + " | ");
        System.out.print("NÍVEL: " + getNivel() + " | ");
        System.out.print("OURO: " + getOuro());
        System.out.println();
        System.out.println("                                                                                                                        ");


        // Imprime os detalhes da arma equipada
        System.out.print("ARMA: ");
        if (getArma() != null) {
            System.out.print("- " + getArma().getNome());
        } else {
            System.out.print("NÃO TENS ARMA");
        }
        System.out.println();

        // Imprime os detalhes das poções de cura do arqueiro, caso existam
        if (getPocoes().size() > 0) {
            System.out.print("POÇÕES: ");
            for (PocaoHP pocao : getPocoes()) {
                System.out.print("- " + pocao.getNome() + " ");
            }
            System.out.println();
        } else {
            System.out.println("SEM POÇÕES");
        }
    }
}