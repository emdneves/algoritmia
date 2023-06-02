package PL_13_03;


public class ContaCorrente extends ContaBancaria implements Transferivel {
    public ContaCorrente(String titular, double saldo) {
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

    @Override
    public void transferir(double valor, ContaBancaria contaDestino) {
        if (valor <= getSaldo()) {
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada. Saldo atual: " + novoSaldo);
        } else {
            System.out.println("Saldo insuficiente para transferência. Operação não realizada.");
        }
    }
}
