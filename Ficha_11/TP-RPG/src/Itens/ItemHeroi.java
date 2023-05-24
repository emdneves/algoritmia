package Itens;

import Entidades.Heroi;

public abstract class ItemHeroi {
    protected String nome;
    protected int preco;
    protected Heroi.TipoHeroi[] tipoHeroi;

    public ItemHeroi(String nome, int preco, Heroi.TipoHeroi[] tipoHeroi) {
        this.nome = nome;
        this.preco = preco;
        this.tipoHeroi = tipoHeroi;
    }

    public abstract void mostrarDetalhes();
}
