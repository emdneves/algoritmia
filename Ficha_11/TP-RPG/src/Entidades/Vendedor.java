package Entidades;

import Itens.ItemHeroi;

public class Vendedor {
    private ItemHeroi[] itens;

    public Vendedor() {
        // Implementação do construtor do Vendedor
        this.itens = new ItemHeroi[10];
    }

    public void imprimirInventario() {
        // Implementação da impressão do inventário
        System.out.println("Inventário do vendedor:");
        for (ItemHeroi item : itens) {
            if (item != null) {
                item.mostrarDetalhes();
            }
        }
    }

    public void vender(Heroi heroi) {
        // Implementação da venda do item
        if (itens.length > 0) {
            ItemHeroi item = itens[itens.length - 1];
            itens[itens.length - 1] = null;
            heroi.adicionarItem(item);
            System.out.println("O vendedor vendeu o item " + item.getNome() + " para o herói " + heroi.getNome());
        } else {
            System.out.println("O vendedor não possui itens para vender.");
        }
    }
}
