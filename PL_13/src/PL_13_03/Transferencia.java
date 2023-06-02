package PL_13_03;


public class Transferencia {

    public static void main(String[] args) {
        ContaPoupanca contaPoupanca1 = new ContaPoupanca("Vitor Santos", 10000);
        ContaCorrente contaCorrente1 = new ContaCorrente("Bruno Santos", 500);

        contaPoupanca1.mostrarSaldo();
        contaCorrente1.mostrarSaldo();

        contaPoupanca1.depositar(2000);
        contaCorrente1.depositar(1000);

        contaPoupanca1.mostrarSaldo();
        contaCorrente1.mostrarSaldo();

        contaPoupanca1.levantar(500);
        contaCorrente1.levantar(2000);

        contaPoupanca1.mostrarSaldo();
        contaCorrente1.mostrarSaldo();

        contaCorrente1.transferir(1000, contaPoupanca1);

        contaPoupanca1.mostrarSaldo();
        contaCorrente1.mostrarSaldo();
    }
}

