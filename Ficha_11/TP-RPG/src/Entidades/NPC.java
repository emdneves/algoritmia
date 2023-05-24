package Entidades;

public class NPC extends Entidade {
    public NPC(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }

    @Override
    public void mostrarDetalhes() {
        // Implementação da exibição dos detalhes do NPC
        System.out.println("Detalhes do NPC " + nome + ":");
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + forca);
    }
}
