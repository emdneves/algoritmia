package factory3;

public class Main {
    public static void main(String[] args) {
        Document documentoTexto = DocumentFactory.createDocument(".doc", "programação orientada a objetos", "vitor santos");
        Document folhaCalculo = DocumentFactory.createDocument(".calc", "programação web", "bruno santos");
        Document apresentacao = DocumentFactory.createDocument(".pres", "laravel", "sara barreto");

        System.out.println("------------DOC 1---------------");
        documentoTexto.open();
        documentoTexto.save();
        documentoTexto.close();

        System.out.println("------------CALC 2---------------");
        folhaCalculo.open();
        folhaCalculo.save();
        folhaCalculo.close();

        System.out.println("------------PRES 3---------------");
        apresentacao.open();
        apresentacao.save();
        apresentacao.close();
    }
}