package PL_10;

import java.util.ArrayList;
import java.util.Iterator;
public class Competicao {
    private String nome;
    private String pais;
    private ArrayList<Atleta> listaAtletas;

    public Competicao(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
        this.listaAtletas = new ArrayList();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Atleta> getListaAtletas() {
        return this.listaAtletas;
    }

    public void setListaAtletas(ArrayList<Atleta> listaAtletas) {
        this.listaAtletas = listaAtletas;
    }

    public void adicionarAtleta(Atleta atleta) {
        this.listaAtletas.add(atleta);
        System.out.println("Atleta " + atleta.getNome() + " adicionado à competição " + this.nome);
    }

    public void adicionarCompeticao(ArrayList<Atleta> listaAtletas) {
        this.listaAtletas.addAll(listaAtletas);
        System.out.println("Competição " + this.nome + " adicionada com sucesso.");
    }

    public void imprimirCompeticao() {
        System.out.println("Competição: " + this.nome);
        System.out.println("País: " + this.pais);
        System.out.println("Lista de atletas:");
        Iterator var1 = this.listaAtletas.iterator();

        while(var1.hasNext()) {
            Atleta atleta = (Atleta)var1.next();
            System.out.println("Nome: " + atleta.getNome() + " - Modalidade: " + atleta.getModalidade() + " - País de origem: " + atleta.getPaisOrigem() + " - Altura: " + atleta.getAltura() + " - Peso: " + atleta.getPeso());
        }

    }
}

