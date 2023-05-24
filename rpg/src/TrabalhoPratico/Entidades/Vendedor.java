package TrabalhoPratico.Entidades;

import TrabalhoPratico.Itens.Arma;
import TrabalhoPratico.Itens.ItemHeroi;
import TrabalhoPratico.Itens.PocaoHP;

import java.util.ArrayList;

public class Vendedor {
    private ArrayList<ItemHeroi> inventario;

    //! --------------------------- Construtor ----------------------------------

    public Vendedor(ArrayList<ItemHeroi> inventario) {
        this.inventario = inventario;
    }

    //! --------------------------- Metodos ----------------------------------

    public void imprimirInventario() {

        System.out.println("");
        System.out.println("Inventário do Vendedor:");
        for (ItemHeroi item : inventario) {

            item.mostrarDetalhes();
            System.out.println("--------------------");

        }
        System.out.println("");

    }

    public void vender(Heroi heroi, ItemHeroi item) {
        if (heroi.getOuro() >= item.getPrecoOuro() && heroi.tipoHeroi.containsAll(item.getTipoHeroi())) {
            // Verificar se o item é uma arma
            if (item instanceof Arma) {
                // Substituir a arma atual do herói pela nova arma
                heroi.setArma((Arma) item);
            } else {
                // Adicionar a poção ao inventário do herói
                heroi.getPocaoList().add((PocaoHP) item);
            }

            // Decrementar o ouro do herói
            heroi.setOuro(heroi.getOuro() - item.getPrecoOuro());

            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Compra não pode ser efetuada.");
        }
    }
}
