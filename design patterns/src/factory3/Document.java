package factory3;

public abstract class Document {
    protected String extensao;
    protected String nome;
    protected String autor;

    public Document( String extensao, String nome, String autor) {
        this.extensao = extensao;
        this.nome = nome;
        this.autor = autor;

    }

    public abstract void open();
    public abstract void save();
    public abstract void close();
}