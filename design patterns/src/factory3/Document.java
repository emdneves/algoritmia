package factory3;

public abstract class Document {
    protected String nome;
    protected String autor;

    public Document(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }

    public abstract void open();
    public abstract void save();
    public abstract void close();
}