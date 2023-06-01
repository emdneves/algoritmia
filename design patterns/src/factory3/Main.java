package factory3;

public class Main {
    public static void main(String[] args) {
        Document documentoTexto = DocumentFactory.createDocument("plain", "programação orientada a objetos", "vitor santos");
        Document folhaCalculo = DocumentFactory.createDocument("sheet", "programação web", "bruno santos");
        Document apresentacao = DocumentFactory.createDocument("present", "laravel", "sara barreto");

        System.out.println("------------ORDER 1---------------");
        documentoTexto.open();
        documentoTexto.save();
        documentoTexto.close();

        System.out.println("------------ORDER 2---------------");
        folhaCalculo.open();
        folhaCalculo.save();
        folhaCalculo.close();

        System.out.println("------------ORDER 3---------------");
        apresentacao.open();
        apresentacao.save();
        apresentacao.close();
    }
}
