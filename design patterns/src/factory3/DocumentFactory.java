package factory3;

import factory3.TiposDeDocumento.*;

public class DocumentFactory {
    public static Document createDocument(String extensao, String nome, String autor) {
        switch (extensao) {
            case "sheet":
                return new CalcSheet(nome, autor);
            case "plain":
                return new PlainText(nome, autor);
            case "present":
                return new Presentation(nome, autor);
            default:
                throw new IllegalArgumentException("Tipo de documento inválido: " + extensao);
        }
    }
}