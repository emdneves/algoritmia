package Itens;

import Entidades.Heroi;

public class PocaoHP extends ItemHeroi {
    private int vidaCurar;

    public PocaoHP(String nome, int preco, Heroi.TipoHeroi[] tipoHeroi, int vidaCurar) {
        super(nome, preco, tipoHeroi);
        this.vidaCurar = vidaCurar;
    }

    @Override
    public void mostrarDetalhes() {
        // Implementação da exibição dos detalhes da Poção de HP
        System.out.println("Detalhes da poção de HP " + nome + ":");
        System.out.println("Preço: " + preco);
        System.out.print("Tipo(s) de herói compatível(s): ");
        for (Heroi.TipoHeroi tipo : tipoHeroi) {
            System.out.print(tipo + " ");
        }
        System.out.println();
        System.out.println("Vida a curar: " + vidaCurar);
    }
}
