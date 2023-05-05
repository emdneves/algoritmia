public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void aumentarSalario(double aumento) {
        this.salario *= 1.0 + aumento / 100.0;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Departamento: " + this.departamento);
    }
}
