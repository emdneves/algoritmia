package PL_03;

public class veiculosMain {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Mercedes", "GLA", 2021, 211, 2.5, 13.5, Combustivel.DIESEL);
        Carro carro2 = new Carro("BMW", "116i", 2022, 80, 1.6, 6.6, Combustivel.GASOLINA);

        Mota mota = new Mota("Honda", "Africa Twin", 2020, 75, 1100, 4.9);
        mota.imagem();
        Camiao camiao = new Camiao("Volvo", "FH16", 2019, 750, 16, 21.5, 500);

        Carro vencedor = (Carro) carro1.corrida(carro2);
        System.out.println("O carro : ");
        carro1.exibirDetalhes();
        System.out.println("Vai correr contra o carro: ");
        carro2.exibirDetalhes();
        System.out.println("O carro vencedor é: ");
        vencedor.exibirDetalhes();

        System.out.println();

        System.out.println("Para uma viagem de 200km o carro: ");
        carro1.exibirDetalhes();
        System.out.println("Vai gastar: ");
        carro1.calcularCusto(200);

        System.out.println();

        camiao.viagem(600, 500);
        System.out.println();
        camiao.viagem(400, 700);


    }
}