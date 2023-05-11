//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class PL_10_01 {
    public PL_10_01() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        Car fullCar = new Car("Mercedes", "4x4", 1970, 1500.0, 200.0, 12.0, TipoCombustivel.DIESEL);
        Car fullCar2 = new Car("BMW", "salsicha", 2023, 2500.0, 300.0, 7.0, TipoCombustivel.GASOLINA);
        fullCar.exibirDetalhes();
        fullCar2.exibirDetalhes();
        System.out.println("");
        System.out.println("-----------------------------------------------------------");
        fullCar.turnOn();
        fullCar2.turnOn();
        System.out.println("");
        System.out.println("-----------------------------------------------------------");
        fullCar.litrosGastos(200.0);
        fullCar2.litrosGastos(6.0);
        System.out.println("");
        System.out.println("-----------------------------------------------------------");
        Car vencedor = fullCar2.corrida(fullCar);
        System.out.println("O vencedor da corrida é: " + vencedor.getBrand() + " " + vencedor.getModel());
        fullCar.corrida(fullCar2);
        System.out.println("O vencedor da corrida é: " + vencedor.getBrand() + " " + vencedor.getModel());
        System.out.println("");
        System.out.println("-----------------------------------------------------------");
        double distancia = 97.0;
        fullCar.litrosGastos(distancia);
        fullCar2.litrosGastos(distancia);
    }
}
