package factory3.TiposDeDocumento;

import factory3.*;

public class CalcSheet extends Document {


    @Override
    public void open() {
        System.out.println("A abrir o documento de" + [tipo de documento] + nome + extensão);
    }

    @Override
    public void save() {
        System.out.println("Alterações do " + autor + "gravadas”);
    }

    @Override
    public void close() {
        System.out.println("A fechar o documento de" + [tipo de documento]);
    }
}