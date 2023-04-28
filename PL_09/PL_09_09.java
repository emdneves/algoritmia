/* 9. Crie uma classe Produto que tenha os atributos nome, preço e quantidade em stock, 
e os métodos comprar e vender, que recebam a quantidade desejada como parâmetro e atualizem o stock. 
No método main, crie um objeto dessa classe e chame os métodos para comprar 5 unidades e vender 2 unidades, e imprima a quantidade de stock.
 */

import java.util.Scanner;

public class Produto {
    private String nome;
    private int preco;
    private int stock;

    public Produto(String nome, int preco, int stock) {
        this.nome = nome;
        this.preco = preco;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public int setVenda(int alteraStock) {
        this.stock = stock - alteraStock;
        return stock;
    }

    public int setCompra(int alteraStock) {
        this.stock = stock + alteraStock;
        return stock;
    }

    public static void main(String[] args) {
        String nome = "bic";
        int preco = 9;
        int stock = 50;
        Produto caneta = new Produto(nome, preco, stock);

        System.out.println("Existem " + caneta.getStock() + " " + nome);

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza a operação a ser feita: ");
        String op = input.next();

        System.out.print("Introduza a quantidade: ");
        int alteraStock = input.nextInt();

        if (op.equals("compra")) {
            caneta.setCompra(alteraStock);
            System.out.println("\nDepois da compra: ");
            System.out.println("Existem " + caneta.getStock() + " " + nome);
        } else if (op.equals("venda")) {
            caneta.setVenda(alteraStock);
            System.out.println("\nDepois da venda: ");
            System.out.println("Existem " + caneta.getStock() + " " + nome);
        }

        else {
            System.out.println("erro, introduza compra ou venda");
        }
    }
}
