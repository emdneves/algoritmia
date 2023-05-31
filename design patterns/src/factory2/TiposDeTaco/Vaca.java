package factory2.TiposDeTaco;

import factory2.*;

public class Vaca extends Taco {
    @Override
    public void Prepare() {
        System.out.println("A preparar taco de vaca");
    }

    @Override
    public void Bake() {
        System.out.println("A cozinhar taco de vaca");
    }

    @Override
    public void Box() {
        System.out.println("A embalar taco de vaca");
    }
}