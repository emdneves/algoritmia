package TrabalhoPratico.Entidades;

import TrabalhoPratico.Itens.Arma;
import TrabalhoPratico.Itens.PocaoHP;

import java.util.ArrayList;

public class Feiticeiro extends Heroi {
    public Feiticeiro(String nome, int vida, int forca, int nivel, int ouro, Arma arma, ArrayList<PocaoHP> pocaoList) {
        super(nome, vida, forca, nivel, ouro, arma, pocaoList);
    }

    @Override
    public void atacar(NPC npc) {
        System.out.println("----- Batalha entre Feiticeiro e NPC -----");
        System.out.println("Herói: " + getNome() + " VS NPC: " + npc.getNome());

        while (getVida() > 0 && npc.getVida() > 0) {
            // Feiticeiro ataca o NPC
            int danoFeiticeiro = getForca() + getArma().getAtaque();
            int danoTotal = danoFeiticeiro + getArma().getAtaque();
            npc.setVida(npc.getVida() - danoTotal);
            System.out.println(getNome() + " atacou " + npc.getNome() + " e causou " + danoTotal + " de dano.");

            // Verificar se o NPC morreu após o ataque do Feiticeiro
            if (npc.getVida() <= 0) {
                System.out.println(getNome() + " derrotou " + npc.getNome() + ".");
                nivelUp(); // Call the nivelUp() method
                return;
            }

            // NPC ataca o Feiticeiro
            int danoNpc = npc.getForca();
            setVida(getVida() - danoNpc);
            System.out.println(npc.getNome() + " atacou " + getNome() + " e causou " + danoNpc + " de dano.");

            // Verificar se o Feiticeiro morreu após o ataque do NPC
            if (getVida() <= 0) {
                System.out.println(getNome() + " foi derrotado pelo " + npc.getNome() + ".");
                return;
            }
        }
    }

    @Override
    public void mostrarDetalhes() {
        // Implement the mostrarDetalhes() method if needed
    }

    // Define the nivelUp() method
    public void nivelUp() {
        // Implement the nivelUp() logic for the Feiticeiro class
    }
}
