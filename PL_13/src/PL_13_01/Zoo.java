package PL_13_01;

public class Zoo {
    public static void main(String[] args) {
        Cao bobby = new Cao("bobby", "beagle");
        Peixe bino = new Peixe("bino", "bacalhau");

        bobby.andar();
        bobby.emitirSom();
        bobby.saltar();

        bino.nadar();
        bino.emitirSom();

    }
}

