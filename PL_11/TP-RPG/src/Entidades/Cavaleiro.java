package Entidades;

public class Cavaleiro extends Heroi {
    public Cavaleiro(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }

    @Override
    public Entidade atacar(NPC npc) {
        // Implementação do ataque do Cavaleiro
        System.out.println("O Cavaleiro " + nome + " atacou o NPC " + npc.getNome() + " com força " + forca);
        npc.receberDano(forca);
        return npc;
    }
}
