package Entidades;

// CHECK

/**
 * Classe abstracta Heroi que define um Herio no jogo e delega para as suas subclasses a especificação dos intervenientes no jogo
 */
public abstract class Entidade {

    private String nome;
    private int vida;
    private int forca;

    /**
     * Construtor da classe Heroi que define que todas as entidades terão nome vida e força
     *
     * @param nome  nome da entidade
     * @param vida  quantidade de vida da entidade
     * @param forca força da entidade
     */

    public Entidade(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * método abstrato que delega as subclasses a responsabilidade de mostrar os detalhes das entidades
     */
    public abstract void mostrarDetalhes();

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * obtém o nome da Entidade
     *
     * @return nome da Entidade
     */
    public String getNome() {
        return nome;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * obtém a vida actual da Entidade
     *
     * @return vida actual da Entidade
     */
    public int getVida() {
        return vida;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * define a quantidade actual de vida da Entidade
     *
     * @param vida quantidade actual de vida da Entidade
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * obtém a força actual da Entidade
     *
     * @return força actual da Entidade
     */
    public int getForca() {
        return forca;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * define a quantidade actual de força da Entidade
     *
     * @param forca quantidade actual de força da Entidade
     */
    public void setForca(int forca) {
        this.forca = forca;
    }
}





