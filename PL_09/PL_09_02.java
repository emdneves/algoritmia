/* 2. Escreva um programa onde cria uma classe chamada "Cão" com um nome e um atributo de raça. 
Deve conter um método de ladrar (imprime na consola um latido). 
Crie três instâncias da classe "Cão", defina os seus atributos usando o construtor e modifique os atributos usando os métodos setter e imprima os valores atualizados.
 */

 public class Cao {
    private String nome;
    private String raca;
    private String ladrar;

    public Cao(String nome, String raca, String ladrar) {
        this.nome = nome;
        this.raca = raca;
        this.ladrar = ladrar;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getLadrar() {
        return ladrar;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setLadrar(String ladrar) {
        this.ladrar = ladrar;
    }

    public static void main(String[] args) {
        Cao cao1 = new Cao("patron", "bulldogue francês", "cansado");
        Cao cao2 = new Cao("missy", "bulldogue francês", "auauau");

        System.out.println("Cao 1 - Nome: " + cao1.getNome() + ", raça: " + cao1.getRaca() + ", ladrar: " + cao1.getLadrar());
        System.out.println("Cao 2 - Nome: " + cao2.getNome() + ", raça: " + cao2.getRaca() + ", ladrar: " + cao2.getLadrar());

        // Modifying attributes using setters
        cao1.setNome("boris");
        cao1.setRaca("bulldogue francês mutante");
        cao1.setLadrar("uivar");

        System.out.println("\nDepois da modificação do Cao 1: ");
        System.out.println("Cao 1 - Nome: " + cao1.getNome() + ", raça: " + cao1.getRaca() + ", ladrar: " + cao1.getLadrar());
    }
}