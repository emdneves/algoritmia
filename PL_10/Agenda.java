package PL_10;

import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {
    private ArrayList<Pessoa> pessoas = new ArrayList();

    public Agenda() {
    }

    public void adicionarPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
        System.out.println("Pessoa adicionada com sucesso!");
    }

    public void listarPessoas() {
        if (this.pessoas.isEmpty()) {
            System.out.println("Não há pessoas na agenda.");
        } else {
            System.out.println("Lista de pessoas:");
            Iterator var1 = this.pessoas.iterator();

            while(var1.hasNext()) {
                Pessoa pessoa = (Pessoa)var1.next();
                System.out.println(pessoa.getNome() + " - " + pessoa.getEmail() + " - " + pessoa.getTelemovel() + " - " + pessoa.getIdade());
            }
        }

    }
}