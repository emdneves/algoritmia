package Entidades.Herois;

import Entidades.Entidade;
import Entidades.Heroi;
import Entidades.NPC;
import Itens.PocaoHP;

/**
 * Classe Cavaleiro que define um Cavaleiro - deriva de Heroi que por sua vez deriva de Entidade
 */
public class Cavaleiro extends Heroi {

    /**
     * Construtor da classe Cavaleiro, que herda da superclasse Heroi os parâmetros nome, vida, força, nível e ouro
     *
     * @param nome  nome do Cavaleiro
     * @param vida  quantidade de vida do Cavaleiro
     * @param forca força do Cavaleiro
     * @param nivel nível do Cavaleiro
     * @param ouro  quantidade de ouro do Cavaleiro
     */
    public Cavaleiro(String nome, int vida, int forca, int nivel, int ouro) {
        super(nome, vida, forca, nivel, ouro);
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * método que representa um ataque de um herói a um NPC, aplicado à especificidade da classe Cavaleiro
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
                // O herói sofre dano do NPC (80% da força do NPC por causa da armadura do cavaleiro)
                int danoInimigo = (int) (npc.getForca() * 0.8);
                this.subtrairVida(danoInimigo);
                System.out.println("--------------------");
                System.out.println("HP " + this.getNome() + " : " + this.getVida());

                if (this.getVida() > 0) {
                    // Calcula o dano causado pelo herói, considerando sua força e o ataque da arma
                    int danoHeroi = this.getForca() + this.getArma().getAtaque();
                    npc.setVida(npc.getVida() - danoHeroi);
                    System.out.println("HP do " + npc.getNome() + " : " + npc.getVida());

                    // Verifica se o NPC foi derrotado
                    if (npc.getVida() <= 0) {
                        // O herói sobe de nível, aumentando a sua vida, força e GP
                        this.subirNivel();
                        this.aumentarVida(10);
                        this.aumentarForca(1);
                        this.aumentarOuro(10);
                    }
                }
            }
        }

        // Verifica o resultado do combate
        if (npc.getVida() <= 0 && existeArma == true) {

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
     * método void, que serve apenas para imprimir os detalhes do Cavaleiro, método delegado pela sua superclasse Heroi
     */
    @Override
    public void mostrarDetalhes() {

        System.out.println("");

        // Imprime os detalhes do Cavaleiro
        System.out.print("CAVALEIRO  " + " | ");
        System.out.print("NOME: " + getNome() + " | ");
        System.out.print("VIDA: " + getVida() + " | ");
        System.out.print("FORÇA: " + getForca() + " | ");
        System.out.print("NÍVEL: " + getNivel() + " | ");
        System.out.print("OURO: " + getOuro());
        System.out.println();
        System.out.println("                                            ");

        // Imprime os detalhes da arma equipada pelo cavaleiro
        System.out.print("ARMA: ");
        if (getArma() != null) {
            System.out.print("- " + getArma().getNome());
        } else {
            System.out.print("NÃO TENS ARMAS CONTIGO");
        }
        System.out.println();

        // Imprime os detalhes das poções de cura do cavaleiro, caso existam
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
