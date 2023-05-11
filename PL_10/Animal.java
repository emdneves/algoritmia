package PL_10;

import java.util.ArrayList;
import java.util.Iterator;
public class Animal {
    private String nome;
    private String especie;
    private String pais_origem;
    private double peso;
    private ArrayList<String> alimentacao;

    public Animal(String nome, String especie, String pais_origem, double peso, ArrayList<String> alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.pais_origem = pais_origem;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPais_origem() {
        return this.pais_origem;
    }

    public void setPais_origem(String pais_origem) {
        this.pais_origem = pais_origem;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<String> getAlimentacao() {
        return this.alimentacao;
    }

    public void setAlimentacao(ArrayList<String> alimentacao) {
        this.alimentacao = alimentacao;
    }

    public boolean comer(String alimento, double pesoAlimento) {
        Iterator var4 = this.alimentacao.iterator();

        String comida;
        do {
            if (!var4.hasNext()) {
                System.out.println("O animal recusou essa comida");
                return false;
            }

            comida = (String)var4.next();
        } while(!comida.equals(alimento));

        this.peso += pesoAlimento / 1000.0;
        System.out.println("O animal comeu");
        return true;
    }
}

