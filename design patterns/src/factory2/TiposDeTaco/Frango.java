package factory2.TiposDeTaco;

import factory2.*;

public class Frango extends Taco {
    @Override
    public void Prepare() {
        System.out.println("A preparar taco de frango");
    }

    @Override
    public void Bake() {
        System.out.println("A cozinhar taco de frango");
    }

    @Override
    public void Box() {
        System.out.println("A embalar taco de frango");
    }
}