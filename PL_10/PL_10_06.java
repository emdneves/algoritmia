//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;

public class PL_10_06 {
    public PL_10_06() {
    }

    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Usain Bolt", "100m rasos", "Jamaica", 1.95, 94.0);
        Atleta atleta2 = new Atleta("Simone Biles", "ginástica artística", "Estados Unidos", 1.45, 47.0);
        Atleta atleta3 = new Atleta("Michael Phelps", "natação", "Estados Unidos", 1.93, 88.0);
        Atleta atleta4 = new Atleta("Neymar Jr", "futebol", "Brasil", 1.75, 68.0);
        Atleta atleta5 = new Atleta("Serena Williams", "tênis", "Estados Unidos", 1.75, 70.0);
        Competicao competicao1 = new Competicao("Olimpíadas de Tóquio", "Japão");
        Competicao competicao2 = new Competicao("Copa do Mundo", "Catar");
        competicao1.adicionarAtleta(atleta1);
        competicao1.adicionarAtleta(atleta2);
        competicao1.adicionarAtleta(atleta3);
        competicao2.adicionarAtleta(atleta4);
        competicao2.adicionarAtleta(atleta5);
        ArrayList<Competicao> listaCompeticoes = new ArrayList();
        listaCompeticoes.add(competicao1);
        listaCompeticoes.add(competicao2);
        Iterator var9 = listaCompeticoes.iterator();

        while(var9.hasNext()) {
            Competicao competicao = (Competicao)var9.next();
            System.out.println("Competição: " + competicao.getNome() + " - País: " + competicao.getPais());
            System.out.println("Atletas participantes: ");
            Iterator var11 = competicao.getListaAtletas().iterator();

            while(var11.hasNext()) {
                Atleta atleta = (Atleta)var11.next();
                System.out.println(atleta.getNome() + " - " + atleta.getModalidade() + " - " + atleta.getPaisOrigem() + " - Altura: " + atleta.getAltura() + " - Peso: " + atleta.getPeso());
            }

            System.out.println("----------------------");
        }

    }
}
