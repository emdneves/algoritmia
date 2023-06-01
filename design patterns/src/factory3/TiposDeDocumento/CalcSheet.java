package factory3.TiposDeDocumento;

import factory3.Document;

public class CalcSheet extends Document {
    public CalcSheet(String nome, String autor) {
        super(nome, autor);
    }

    @Override
    public void open() {
        System.out.println("A abrir o documento de planilha: " + nome);
    }

    @Override
    public void save() {
        System.out.println("Alterações de " + autor + " gravadas");
    }

    @Override
    public void close() {
        System.out.println("A fechar o documento de planilha: " + nome);
    }
}
