package Entidades;

public abstract class Heroi extends Entidade {
    protected int nivel;
    protected int ouro;
    protected Arma arma;
    protected PocaoHP[] pocoes;

    public Heroi(String nome, int vida, int forca) {
        super(nome, vida, forca);
        this.nivel = 1;
        this.ouro = 0;
        this.arma = null;
        this.pocoes = new PocaoHP[10];
    }

    public abstract Entidade atacar(NPC npc);

    public void usarPocao() {
        // Implementação do uso da poção
        if (pocoes.length > 0) {
            PocaoHP pocao = pocoes[pocoes.length - 1];
            pocoes[pocoes.length - 1] = null;
            // Lógica para curar a vida do herói usando a poção
            System.out.println("O herói usou uma poção de HP e recuperou " + pocao.getVidaCurar() + " pontos de vida.");
        } else {
            System.out.println("O herói não possui poções de HP.");
        }
    }

    public void imprimirInventario() {
        // Implementação da impressão do inventário
        System.out.println("Inventário do herói " + nome + ":");
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + forca);
        System.out.println("Ouro: " + ouro);
        System.out.println("Arma: " + (arma != null ? arma.getNome() : "Nenhuma"));
        System.out.println("Poções de HP:");
        for (PocaoHP pocao : pocoes) {
            if (pocao != null) {
                System.out.println("- " + pocao.getNome());
            }
        }
    }
}
