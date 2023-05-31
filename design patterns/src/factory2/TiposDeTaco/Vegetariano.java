package factory2.TiposDeTaco;

import factory2.*;

public class Vegetariano extends Taco {
    @Override
    public void Prepare() {
        System.out.println("A preparar taco de vegetariano");
    }

    @Override
    public void Bake() {
        System.out.println("A cozinhar taco de vegetariano");
    }

    @Override
    public void Box() {
        System.out.println("A embalar taco de vegetariano");
    }
}
