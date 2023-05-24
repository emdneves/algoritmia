package TrabalhoPratico.Entidades;

/**
 * A classe abstrata Entidade representa uma entidade genérica do jogo.
 */
public abstract class Entidade {
    private String nome;
    private int vida;
    private int forca;

    //! --------------------------- Construtor ----------------------------------

    /**
     * Construtor da classe Entidade.
     *
     * @param nome  O nome da entidade.
     * @param vida  A quantidade de vida da entidade.
     * @param forca O valor da força da entidade.
     */
    public Entidade(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    //! --------------------------- Metodos ----------------------------------

    /**
     * Método abstrato para exibir os detalhes da entidade.
     * Cada uma das subclasses deve implementar a sua própria lógica para mostrar os detalhes.
     */

    public abstract void mostrarDetalhes();

    //! --------------------------- Getters e Setters ----------------------------------

    /**
     * Obtém o nome da entidade.
     *
     * @return O nome da entidade.
     */

    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da entidade.
     *
     * @param nome O nome da entidade.
     */

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a quantidade de vida da entidade.
     *
     * @return A quantidade de vida da entidade.
     */

    public int getVida() {
        return vida;
    }

    /**
     * Define a quantidade de vida da entidade.
     *
     * @param vida A quantidade de vida da entidade.
     */

    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * Obtém o valor da força da entidade.
     *
     * @return O valor da força da entidade.
     */

    public int getForca() {
        return forca;
    }

    /**
     * Define o valor da força da entidade.
     *
     * @param forca O valor da força da entidade.
     */

    public void setForca(int forca) {
        this.forca = forca;
    }

}



