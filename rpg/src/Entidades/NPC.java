package Entidades;

// CHECK

/**
 * Classe NPC que define uma enimigo no jogo (npc)
 */
public class NPC extends Entidade {

    /**
     * Construtor da classe NPC, que herda da superclasse Entidade os parâmetros nome, vida e força
     *
     * @param nome  o nome do NPC
     * @param vida  a vida do NPC
     * @param forca a força do NPC
     */
    public NPC(String nome, int vida, int forca) {

        super(nome, vida, forca);
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * método void, que serve apenas para imprimir os detalhes do NPC, método delegado pela sua superclasse Entidade
     */
    @Override
    public void mostrarDetalhes() {
        System.out.println();
        System.out.println("DETALHES NPC");
        System.out.println("NOME: " + getNome());
        System.out.println("VIDA: " + getVida());
        System.out.println("FORÇA: " + getForca());
        System.out.println();
    }

}