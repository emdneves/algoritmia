package PL_03;

public class Camiao extends Veiculo{

    int capacidaDeCarga;

    public Camiao(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, double consumo, int capacidaDeCarga) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, consumo);
        this.capacidaDeCarga=capacidaDeCarga;
    }

    public void viagem(int km, int carga){
        if(carga > this.capacidaDeCarga){
            System.out.println("Viagem recusada por excesso de peso!");
        }else{
            double consumoViagem = consumo(km) + (carga/100)*0.2;
            System.out.println("Esta viagem vai ter um consumo de " + consumoViagem + "lt.");
        }
    }
}