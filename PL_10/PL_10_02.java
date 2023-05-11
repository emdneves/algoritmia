//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class PL_10_02 {
    public PL_10_02() {
    }

    public static void main(String[] args) {
        Conta conta1 = new Conta("111222", "Cristiano Ronaldo", 2000.0);
        System.out.println("Margem de Empréstimo C1: " + conta1.getMargemEmprestimo());
        Conta conta2 = new Conta("222333", "Conor Mcgregor", 3000.0);
        System.out.println("Margem de Empréstimo C2: " + conta2.getMargemEmprestimo());
        System.out.println("Teste método transferência");
        conta1.transferencia(-10.0, conta2);
        System.out.println("Margem de Empréstimo C1: " + conta1.getMargemEmprestimo());
        System.out.println("Margem de Empréstimo C2: " + conta2.getMargemEmprestimo());
        conta2.transferencia(200.0, conta1);
        System.out.println("Margem de Empréstimo C1: " + conta1.getMargemEmprestimo());
        System.out.println("Margem de Empréstimo C2: " + conta2.getMargemEmprestimo());
        System.out.println("O saldo da conta 1 é: " + conta1.getSaldo() + " e o saldo da conta 2 é : " + conta2.getSaldo());
        System.out.println("");
        System.out.println("-----------------------------------------------------------");
        System.out.println();
        conta1.depositar(-10.0);
        conta2.depositar(2000.0);
        System.out.println("Saldo da Conta " + conta1.getNumeroConta() + ": " + conta1.getSaldo());
        System.out.println("Margem de Empréstimo C1: " + conta1.getMargemEmprestimo());
        System.out.println("Saldo da Conta " + conta2.getNumeroConta() + ": " + conta2.getSaldo());
        System.out.println("Margem de Empréstimo C2: " + conta2.getMargemEmprestimo());
        System.out.println("");
        System.out.println("-----------------------------------------------------------");
        System.out.println();
        conta1.levantar(-10.0);
        conta1.mostrarSaldo();
        System.out.println("Margem de Empréstimo C1: " + conta1.getMargemEmprestimo());
        conta2.levantar(700.0);
        conta2.mostrarSaldo();
        System.out.println("Margem de Empréstimo C2: " + conta2.getMargemEmprestimo());
        System.out.println("");
        System.out.println("-----------------------------------------------------------");
        System.out.println();
        conta1.mostrarMargemEmprestimo();
        conta1.pedirEmprestimo(100.0);
        conta1.mostrarSaldo();
        conta2.mostrarMargemEmprestimo();
        conta2.pedirEmprestimo(2926.0);
        conta2.mostrarSaldo();
    }
}
