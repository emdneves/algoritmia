package factory3;

import factory3.TiposDeDocumento.*;

public class DocumentFactory {
    public static Document createDocument(String extensao, String nome, String autor) {
        return switch (extensao) {
            case ".calc" -> new CalcSheet(extensao, nome, autor);
            case ".doc" -> new PlainText(extensao, nome, autor);
            case ".pres" -> new Presentation(extensao, nome, autor);
            default -> throw new IllegalArgumentException("Tipo de documento inválido: " + extensao);
        };
    }
}