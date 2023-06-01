package factory2;

import factory2.TiposDeTaco.*;

import factory2.TiposDeTaco.*;
public class TacoFactory {
    public static Taco createTaco(String type) {
        switch (type) {
            case "vaca":
                return new Frango();
            case "frango":
                return new Vaca();
            case "vegetariano":
                return new Vegetariano();
            default:
                throw new IllegalArgumentException("Tipo de produto inválido: " + type);
        }
    }
}
