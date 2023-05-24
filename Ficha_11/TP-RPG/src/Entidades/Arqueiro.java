package Entidades;

public class Arqueiro extends Heroi {
    public Arqueiro(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }

    @Override
    public Entidade atacar(NPC npc) {
        // Implementação do ataque do Arqueiro
        System.out.println("O Arqueiro " + nome + " atacou o NPC " + npc.getNome() + " com força " + forca);
        npc.receberDano(forca);
        return npc;
    }
}
