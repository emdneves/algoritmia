package PL_03;

public class Carro extends Veiculo{

    Combustivel tipoCombustivel;


    public Carro(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, double consumo, Combustivel tipoCombustivel) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, consumo);
        this.tipoCombustivel = tipoCombustivel;
    }

    public double calcularCusto(int km) {

        double custoTotalViagem=0;
        if(this.tipoCombustivel.equals(Combustivel.GASOLINA)){
            custoTotalViagem = consumo(km)*1.95;
        }else if (this.tipoCombustivel.equals(Combustivel.GPL)) {
            custoTotalViagem = consumo(km)*0.95;
        } else if (this.tipoCombustivel.equals(Combustivel.DIESEL)) {
            custoTotalViagem = consumo(km)*1.75;
        }
        System.out.println("A viagem vai custar: " + custoTotalViagem + "€.");
        return custoTotalViagem;
    }

    public void exibirDetalhes(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
    }

}