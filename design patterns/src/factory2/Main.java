package factory2;

import factory1.Product;
import factory1.ProductFactory;

public class Main {
    public static void main(String[] args) {

        Taco tacoFrango = TacoFactory.createTaco("vaca");
        Taco tacoVaca = TacoFactory.createTaco("frango");
        Taco tacoVegetariano = TacoFactory.createTaco("vegetariano");

        System.out.println("------------ORDER 1---------------");

        tacoFrango.Prepare();
        tacoFrango.Bake();
        tacoFrango.Box();

        System.out.println("------------ORDER 2---------------");

        tacoVaca.Prepare();
        tacoVaca.Bake();
        tacoVaca.Box();

        System.out.println("------------ORDER 3---------------");

        tacoVegetariano.Prepare();
        tacoVegetariano.Bake();
        tacoVegetariano.Box();





    }




}
