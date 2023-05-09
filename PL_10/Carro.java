package PL_10;

public class Carro {
    private String marca, modelo, tipoCombustivel;
    private int anoFabrico, potencia, cilindrada;
    private double litros;

    public enum Combustivel {
        GASOLINA, DIESEL, GPL
    }



    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, String tipoCombustivel, double litros) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.litros = litros;
    }







}

