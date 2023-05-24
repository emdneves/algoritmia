package TrabalhoPratico.Entidades;

import TrabalhoPratico.Itens.Arma;
import TrabalhoPratico.Itens.PocaoHP;

import java.util.ArrayList;

public class Arqueiro extends Heroi {
    public Arqueiro(String nome, int vida, int forca, int nivel, int ouro, Arma arma, ArrayList<PocaoHP> pocaoList) {
        super(nome, vida, forca, nivel, ouro, arma, pocaoList);
    }

    @Override
    public void atacar(NPC npc) {
        System.out.println("----- Batalha entre Arqueiro e NPC -----");
        System.out.println("Herói: " + getNome() + " VS NPC: " + npc.getNome());

        while (getVida() > 0 && npc.getVida() > 0) {
            // Arqueiro ataca o NPC
            int danoArqueiro = getForca() + getArma().getAtaque();
            int danoTotal = danoArqueiro + getArma().getAtaque();
            npc.setVida(npc.getVida() - danoTotal);
            System.out.println(getNome() + " atacou " + npc.getNome() + " e causou " + danoTotal + " de dano.");

            // Verificar se o NPC morreu após o ataque do Arqueiro
            if (npc.getVida() <= 0) {
                System.out.println(getNome() + " derrotou " + npc.getNome() + ".");
                nivelUp();
                return;
            }

            // NPC ataca o Arqueiro
            int danoNpc = npc.getForca();
            setVida(getVida() - danoNpc);
            System.out.println(npc.getNome() + " atacou " + getNome() + " e causou " + danoNpc + " de dano.");

            // Verificar se o Arqueiro morreu após o ataque do NPC
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

    public void nivelUp() {
        // Implementation of the nivelUp method specific to the Arqueiro class
    }

}
