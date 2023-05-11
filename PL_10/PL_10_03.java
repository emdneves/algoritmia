//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;

public class PL_10_03 {
    public PL_10_03() {
    }

    public static void main(String[] args) {
        ArrayList<String> alimentacao = new ArrayList();
        alimentacao.add("Couves");
        alimentacao.add("Ração");
        alimentacao.add("Bife");
        Animal animal1 = new Animal("Flecha", "Cão", "Rio de Janeiro", 30.0, alimentacao);
        Animal animal2 = new Animal("Thor", "Cão", "Portugal", 50.0, alimentacao);
        animal1.comer("Bife", 300.0);
        animal2.comer("Arroz", 250.0);
        System.out.println("Peso animal 1: " + animal1.getPeso());
        System.out.println("Peso animal 2: " + animal2.getPeso());
    }
}
