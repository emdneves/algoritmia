package TrabalhoPratico.Entidades;

import TrabalhoPratico.Itens.Arma;
import TrabalhoPratico.Itens.PocaoHP;

import java.util.ArrayList;

public class Cavaleiro extends Heroi {
    public Cavaleiro(String nome, int vida, int forca, int nivel, int ouro, Arma arma, ArrayList<PocaoHP> pocaoList) {
        super(nome, vida, forca, nivel, ouro, arma, pocaoList);
    }

    @Override
    public void atacar(NPC npc) {
        System.out.println("----- Batalha entre Cavaleiro e NPC -----");
        System.out.println("Herói: " + getNome() + " VS NPC: " + npc.getNome());

        while (getVida() > 0 && npc.getVida() > 0) {
            // NPC ataca o Cavaleiro
            int danoNpc = (int) (npc.getForca() * 0.8);
            setVida(getVida() - danoNpc);
            System.out.println(npc.getNome() + " atacou " + getNome() + " e causou " + danoNpc + " de dano.");

            // Verificar se o Cavaleiro morreu após o ataque do NPC
            if (getVida() <= 0) {
                System.out.println(getNome() + " foi derrotado pelo " + npc.getNome() + ".");
                return;
            }

            // Cavaleiro ataca o NPC
            int danoCavaleiro = getForca() + getArma().getAtaque();
            int danoTotal = danoCavaleiro + getArma().getAtaque();
            npc.setVida(npc.getVida() - danoTotal);
            System.out.println(getNome() + " atacou " + npc.getNome() + " e causou " + danoTotal + " de dano.");

            // Verificar se o NPC morreu após o ataque do Cavaleiro
            if (npc.getVida() <= 0) {
                System.out.println(getNome() + " derrotou " + npc.getNome() + ".");
                nivelUp();
                return;
            }
        }
    }

    @Override
    public void mostrarDetalhes() {

    }

    public void nivelUp() {
        setNivel(getNivel() + 1);
        setVida(getVida() + 10);
        setForca(getForca() + 5);
        System.out.println("O Cavaleiro " + getNome() + " subiu para o nível " + getNivel() + ".");
        System.out.println("Vida aumentada em 10. Nova vida: " + getVida());
        System.out.println("Força aumentada em 5. Nova força: " + getForca());
    }
}

