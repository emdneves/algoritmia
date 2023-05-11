package PL_10;

public class Conta {
    private String numeroConta;
    private String titular;
    private double saldo;
    private double divida;
    private double margemEmprestimo;
    private int anoAbertura;

    public Conta(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.anoAbertura = this.anoAbertura;
        this.divida = 0.0;
        this.margemEmprestimo = 0.0;
        this.atualizarMargemEmprestimo();
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public double getMargemEmprestimo() {
        return this.margemEmprestimo;
    }

    public boolean transferencia(double valor, Conta contaDestino) {
        if (valor <= 0.0) {
            System.out.println("Só valores positivos são aceitos!");
            return false;
        } else if (this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            this.atualizarMargemEmprestimo();
            System.out.printf("Transferência concluída no valor de %.2f.\n", valor);
            return true;
        } else {
            System.out.println("Erro ao transferir.");
            return false;
        }
    }

    public void atualizarMargemEmprestimo() {
        this.margemEmprestimo = this.saldo * 0.9;
    }

    public void depositar(double valor) {
        if (valor <= 0.0) {
            System.out.println("Só valores positivos são aceitos!");
        } else {
            this.saldo += valor;
            this.atualizarMargemEmprestimo();
            System.out.printf("Depósito de %.2f realizado com sucesso. Saldo atual: %.2f\n", valor, this.saldo);
        }

    }

    public boolean levantar(double valor) {
        if (valor <= 0.0) {
            System.out.println("Só valores positivos são aceitos!");
            return false;
        } else if (this.saldo < valor) {
            System.out.println("Não há saldo suficiente para realizar o levantamento.");
            return false;
        } else {
            this.saldo -= valor;
            this.atualizarMargemEmprestimo();
            System.out.printf("Levantamento de %.2f realizado com sucesso. Saldo atual: %.2f\n", valor, this.saldo);
            return true;
        }
    }

    public boolean pedirEmprestimo(double valor) {
        if (this.margemEmprestimo >= valor && this.divida == 0.0) {
            this.saldo -= valor;
            this.atualizarMargemEmprestimo();
            System.out.printf("O empréstimo de %.2f realizado com sucesso. Saldo atual: %.2f\n", valor, this.saldo);
            return true;
        } else {
            System.out.println("Não há margem de empréstimo suficiente para realizar o levantamento.");
            return false;
        }
    }

    public void mostrarSaldo() {
        System.out.printf("Saldo atual: %.2f\n", this.saldo);
    }

    public void mostrarDivida() {
        System.out.printf("Valor da dívida: %.2f\n", this.divida);
    }

    public void mostrarMargemEmprestimo() {
        System.out.printf("Margem de empréstimo: %.2f\n", this.margemEmprestimo);
    }
}

