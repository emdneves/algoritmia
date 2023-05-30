package Entidades;

import Itens.Arma;
import Itens.ItemHeroi;
import Itens.PocaoHP;
import Itens.TiposHeroi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe Vendedor que define um vendedor
 */
public class Vendedor {

    private ArrayList<ItemHeroi> inventario;

    /**
     * construtor da classe Vendedor
     * inventário de itens inicializado num ArrayList vazio
     */
    public Vendedor() {
        this.inventario = new ArrayList<>();
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * Adiciona um ‘item’ ao inventário do vendedor.
     *
     * @param item O item a ser adicionado.
     */
    public void adicionarItem(ItemHeroi item) {
        inventario.add(item);
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * Imprime o inventário do vendedor, mostrando os detalhes de cada item
     */
    public void imprimirInventario() {

        System.out.println("O QUE HÁ PARA COMPRAR:\n");
        int contador = 1;

        // Percorre o inventário do vendedor com for each, imprimindo assim os detalhes de cada item
        for (ItemHeroi item : inventario) {
            System.out.println("ITEM " + contador);
            item.mostrarDetalhes();
            System.out.println("--------------------");
            contador++;
        }
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/


    /**
     * método vender - é responsável pela interacção com o utilizador no que concerne à venda de itens
     *
     * @param heroi herói que realizará a compra,
     */
    public void vender(Heroi heroi) {

        // Variável para controlar se a venda será continuada ou não
        boolean continuarCompra = true;
        // Array List para armazenar os itens comprados pelo herói
        ArrayList<ItemHeroi> itensComprados = new ArrayList<>();

        // Loop que continua enquanto a compra decorrer
        while (continuarCompra) {

            // Solicita ao user que escolha um item para comprar ou siga em frente
            System.out.println("ESCREVE O NÚMERO DO ITEM OU ZERO PARA SEGUIR SEM COMPRAR:");
            System.out.print("RESPOSTA: ");
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();

            if (index == 0) {
                // Caso o user escolha zero, indica que ele decidiu seguir em frente e encerra a venda
                System.out.println("--------------------");
                System.out.println("SIGA");
                System.out.println("--------------------");
                continuarCompra = false;
            } else if (index >= 1 && index <= inventario.size()) {
                // Caso o user escolha um índice válido do inventário
                ItemHeroi item = inventario.get(index - 1);

                if (!itensComprados.contains(item)) {
                    // Verifica se o item ainda não foi comprado
                    boolean permitido = false;

                    // Verifica se o herói é permitido a usar o item com base nos tipos de herói permitidos pelo item
                    for (TiposHeroi heroiPermitido : item.getTiposHeroi()) {
                        if (heroiPermitido.toString().equals(heroi.getClass().getSimpleName().toUpperCase())) {
                            permitido = true;
                            break;
                        }
                    }

                    if (permitido) {
                        // Verifica se o herói possui GP's suficientes para comprar o item
                        if (heroi.getOuro() >= item.getPreco()) {
                            // Realiza a compra
                            if (item instanceof Arma) {
                                Arma arma = (Arma) item;
                                heroi.setArma(arma);
                            } else if (item instanceof PocaoHP) {
                                PocaoHP pocao = (PocaoHP) item;
                                heroi.adicionarPocao(pocao);
                            }

                            heroi.decrementarOuro(item.getPreco());
                            itensComprados.add(item);
                            inventario.remove(item);
                            System.out.println("--------------------");
                            System.out.println("COMPRASTE " + item.getNome());
                            System.out.println("VALOR: " + item.getPreco());
                            System.out.println("");
                            System.out.println("OURO RESTANTE: " + heroi.getOuro());
                            System.out.println("");
                            System.out.println("--------------------");
                            imprimirInventario();
                        } else {
                            // Caso o herói não tenha GP's suficientes para comprar o item
                            System.out.println("--------------------");
                            System.out.println("ESQUECESTE-TE DA CARTEIRA EM CASA E O MBWAY NAO FUNCIONA");
                            System.out.println("--------------------");
                        }
                    } else {
                        // Caso o herói não seja permitido a usar o item
                        System.out.println("");
                        System.out.println("--------------------");
                        System.out.println("NÃO TENS MORAL PARA ESSE");
                        System.out.println("--------------------");
                    }
                    System.out.print("");
                    heroi.mostrarDetalhes();
                    System.out.print("");
                } else {
                    // Caso o item já tenha sido comprado anteriormente
                    System.out.println("--------------------");
                    System.out.println("JÁ TENS ISSO");
                    System.out.println("--------------------");
                }
            } else {
                // Caso o índice escolhido seja inválido
                System.out.println("--------------------");
                System.out.println("ESCOLHE UMA OPÇÃO VÁLIDA");
                System.out.println("--------------------");
            }
        }
    }

}





