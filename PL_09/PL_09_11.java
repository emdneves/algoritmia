import java.util.Scanner;
import java.io.PrintStream;

public class PL_09_11 {
    public PL_09_11() {
    }

    public static void main(String[] args) {
        Conta conta1 = new Conta("111222", "Cristiano Ronaldo", 120.0);
        Conta conta2 = new Conta("222333", "Conor Mcgregor", 400.0);

        conta1.transferencia(130.0, conta2);
        conta2.transferencia(200.0, conta1);

        PrintStream var10000 = System.out;
        String var10001 = conta1.getNumeroConta();

        var10000.println("Saldo da Conta " + var10001 + ": " + conta1.getSaldo());
        var10000 = System.out;
        var10001 = conta2.getNumeroConta();
        var10000.println("Saldo da Conta " + var10001 + ": " + conta2.getSaldo());
    }
}