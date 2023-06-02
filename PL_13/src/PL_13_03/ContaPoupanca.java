package PL_13_03;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void depositar(double valor) {
        double novoSaldo = getSaldo() + valor;
        setSaldo(novoSaldo);
        System.out.println("Depósito realizado. Saldo atual: " + novoSaldo);
    }

    @Override
    public void levantar(double valor) {
        if (valor <= getSaldo()) {
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
            System.out.println("Levantamento realizado. Saldo atual: " + novoSaldo);
        } else {
            System.out.println("Saldo insuficiente. Operação não realizada.");
        }
    }

    @Override
    public void mostrarSaldo() {
        System.out.println("Saldo atual: " + getSaldo());
    }
}
