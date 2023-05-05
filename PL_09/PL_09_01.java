import java.util.Scanner;

public class PL_09_01 {
    public PL_09_01() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = "Vitor";
        int idade = 23;
        double altura = 1.7;
        Pessoa vitor = new Pessoa(nome, idade, altura);
        Pessoa ana = new Pessoa("Ana", 20, 1.6);
        System.out.println("Nome da primeira pessoa: " + vitor.getNome());
        System.out.println("Idade da primeira pessoa: " + vitor.getIdade());
        System.out.println("Altura da primeira pessoa: " + vitor.getAltura());
        System.out.println();
        System.out.println("Nome da segunda pessoa: " + ana.getNome());
        System.out.println("Idade da segunda pessoa: " + ana.getIdade());
        System.out.println("Altura da segunda pessoa: " + ana.getAltura());
        System.out.println("\n_________________________________________\n");
        System.out.print("Insira o nome da pessoa: ");
        String nomePessoa = input.next();
        System.out.print("Insira a idade da pessoa: ");
        int idadePessoa = input.nextInt();
        System.out.print("Insira a altura da pessoa: ");
        double alturaPessoa = input.nextDouble();
        Pessoa pessoaInputUtilizador = new Pessoa(nomePessoa, idadePessoa, alturaPessoa);
        System.out.println("O nome da pessoa é " + pessoaInputUtilizador.getNome());
        System.out.println("Tem " + pessoaInputUtilizador.getIdade() + " anos");
        System.out.println("E " + pessoaInputUtilizador.getAltura() + " metros de altura");
    }
}
