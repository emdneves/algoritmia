package factory3.TiposDeDocumento;

import factory3.Document;

public class Presentation extends Document {
    public Presentation(String nome, String autor) {
        super(nome, autor);
    }

    @Override
    public void open() {
        System.out.println("A abrir a apresentação: " + nome);
    }

    @Override
    public void save() {
        System.out.println("Alterações de " + autor + " gravadas");
    }

    @Override
    public void close() {
        System.out.println("A fechar a apresentação: " + nome);
    }
}

