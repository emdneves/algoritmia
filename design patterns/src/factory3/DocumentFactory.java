package factory3;

import factory3.TiposDeDocumento.*;

public class DocumentFactory {
    public static Document createDocument(String extensao, String nome, String autor ) {
        switch (extensao) {
            case "sheet":
                return new CalcSheet();
            case "plain":
                return new PlainText();
            case "present":
                return new Present();
            default:
                throw new IllegalArgumentException("Tipo de documento: " + extensao);
        }
    }
}