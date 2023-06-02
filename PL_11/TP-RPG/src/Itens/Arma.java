package Itens;

import Entidades.Heroi;

public class Arma extends ItemHeroi {
    private int ataque;

    public Arma(String nome, int preco, Heroi.TipoHeroi[] tipoHeroi, int ataque) {
        super(nome, preco, tipoHeroi);
        this.ataque = ataque;
    }

    @Override
    public void mostrarDetalhes() {
        // Implementação da exibição dos detalhes da Arma
        System.out.println("Detalhes da arma " + nome + ":");
        System.out.println("Preço: " + preco);
        System.out.print("Tipo(s) de herói compatível(s): ");
        for (Heroi.TipoHeroi tipo : tipoHeroi) {
            System.out.print(tipo + " ");
        }
        System.out.println();
        System.out.println("Ataque: " + ataque);
    }
}
