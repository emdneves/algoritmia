package Entidades;

public class Feiticeiro extends Heroi {
    public Feiticeiro(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }

    @Override
    public Entidade atacar(NPC npc) {
        // Implementação do ataque do Feiticeiro
        System.out.println("O Feiticeiro " + nome + " atacou o NPC " + npc.getNome() + " com força " + forca);
        npc.receberDano(forca);
        return npc;
    }
}
