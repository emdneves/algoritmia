package factory3.TiposDeDocumento;

import factory3.*;

public class PlainText extends Document {
    @Override
    public void open() {
        System.out.println("A preparar taco de frango");
    }

    @Override
    public void save() {
        System.out.println("A cozinhar taco de frango");
    }

    @Override
    public void close() {
        System.out.println("A embalar taco de frango");
    }
}
