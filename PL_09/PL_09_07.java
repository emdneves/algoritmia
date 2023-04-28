/* 7. Crie uma classe chamada "Livro" com os seguintes atributos: título, autor, categoria, número de páginas e ISBN. 
Em seguida, crie um método na classe "Livro" chamado "exibirDetalhes" que imprime na consola todos os atributos do livro. 
DE seguida, crie dois objetso da classe "Livro" e invoque o método "exibirDetalhes".
 */
import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private String categoria;
    private int pages;
    private int isbn;

    public Livro(String titulo, String autor, String categoria, int pages, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.pages = pages;
        this.isbn = isbn;
    }

    public String exibirDetalhes() {
        return "Título: " + titulo + ", Autor: " + autor + ", Categoria: " + categoria + ", Páginas: " + pages + ", ISBN: " + isbn;
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("Título do Livro 1", "Autor do Livro 1", "Categoria do Livro 1", 100, 92132232);
        Livro livro2 = new Livro("Título do Livro 2", "Autor do Livro 2", "Categoria do Livro 2", 200, 92132333);

        System.out.println(livro1.exibirDetalhes());
        System.out.println(livro2.exibirDetalhes());
    }
}

