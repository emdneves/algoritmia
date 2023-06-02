package PL_13_03;

public abstract class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract void depositar(double valor);

    public abstract void levantar(double valor);

    public abstract void mostrarSaldo();

    protected String getTitular() {
        return titular;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
