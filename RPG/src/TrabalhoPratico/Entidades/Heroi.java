package TrabalhoPratico.Entidades;

import java.util.AbstractCollection;
import java.util.ArrayList;

import TrabalhoPratico.Itens.Arma;
import TrabalhoPratico.Itens.PocaoHP;

public abstract class Heroi extends Entidade {
    public AbstractCollection<Object> tipoHeroi;
    private int nivel;
    private int ouro;
    private Arma arma;
    private ArrayList<PocaoHP> pocaoList;

    //! --------------------------- Construtor ----------------------------------

    public Heroi(String nome, int vida, int forca, int nivel, int ouro, Arma arma, ArrayList<PocaoHP> pocaoList) {
        super(nome, vida, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.arma = arma;
        this.pocaoList = pocaoList;
    }

    //! --------------------------- Metodos ----------------------------------
    public abstract void atacar(NPC npc);

    //! --------------------------- Getters e Setters ----------------------------------

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public ArrayList<PocaoHP> getPocaoList() {
        return pocaoList;
    }

    public void setPocaoList(ArrayList<PocaoHP> pocaoList) {
        this.pocaoList = pocaoList;
    }
}