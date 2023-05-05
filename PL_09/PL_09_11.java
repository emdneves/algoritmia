/* 11. Crie uma classe chamada "Conta" com os seguintes atributos: número da conta, saldo e titular da conta. 
Crie um método “transferência” que pergunte ao utilizador a conta de origem, o valor a transferir e a conta de destinatário.
Crie os métodos depositar, levantar e mostrarSaldo. O método depositar deve receber um valor como parâmetro e atualizar o saldo. 
O método levantar deve receber um valor como parâmetro e verificar se é possível realizar a operação, considerando o saldo. 
O método exibirSaldo deve exibir na consola o saldo atual da conta. 
No método main, crie um objeto dessa classe e chame os métodos para depositar 1000€, levantar 120€ e exibir o saldo.
Em seguida, crie dois objetos dessa classe e atribua valores aos seus atributos. 
Em seguida, transfira um valor de uma conta, deve antes confirmar se a transferência é válida, e executar, para a outra e exiba o saldo de cada uma na tela.
 */
import java.io.PrintStream;

public class Ex_11 {
    public Ex_11() {
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


