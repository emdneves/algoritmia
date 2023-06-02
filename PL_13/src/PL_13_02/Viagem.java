package PL_13_02;

public class Viagem {

    public static void main(String[] args) {


    Carro carronovo = new Carro("renault", 1990);
    Mota motanova = new Mota("casal", 1970);

    motanova.acelerar();
    carronovo.acelerar();

    motanova.travar();
    carronovo.travar();

    motanova.transportar();
    carronovo.transportar();

    }
}
