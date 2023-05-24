package TrabalhoPratico.Itens;

import java.util.ArrayList;

public abstract class ItemHeroi {
    private String nome;
    private int precoOuro;
    private ArrayList<String> tipoHeroi;

    //! --------------------------- Construtor ----------------------------------

    public ItemHeroi(String nome, int precoOuro, ArrayList<String> tipoHeroi) {
        this.nome = nome;
        this.precoOuro = precoOuro;
        this.tipoHeroi = tipoHeroi;
    }

    //! --------------------------- Metodos ----------------------------------

    public abstract void mostrarDetalhes();

    //! --------------------------- Getters e Setters ----------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrecoOuro() {
        return precoOuro;
    }

    public void setPrecoOuro(int precoOuro) {
        this.precoOuro = precoOuro;
    }

    public ArrayList<String> getTipoHeroi() {
        return tipoHeroi;
    }

    public void setTipoHeroi(ArrayList<String> tipoHeroi) {
        this.tipoHeroi = tipoHeroi;
    }
}

