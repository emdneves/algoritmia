package PL_03;

import java.util.Scanner;

    public class Veiculo {
        private String marca, modelo;
        private int anoFabrico, potencia;
        private double cilindrada, consumo;

        public Veiculo(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, double consumo) {
            this.marca = marca;
            this.modelo = modelo;
            this.anoFabrico = anoFabrico;
            this.potencia = potencia;
            this.cilindrada = cilindrada;
            this.consumo = consumo;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public int getAnoFabrico() {
            return anoFabrico;
        }

        public int getPotencia() {
            return potencia;
        }

        public double getCilindrada() {
            return cilindrada;
        }

        public double getConsumo() {
            return consumo;
        }


        public void ligar(){
            System.out.println("O carro está ligado");
        }
        public Veiculo corrida(Veiculo adversario){

            if(this.potencia>adversario.potencia){ // Ganha o Carro por potencia
                return this;
            } else if (this.potencia<adversario.potencia) { // Ganha o adversário por potencia
                return adversario;
            }else{ // Empate de potência
                if(this.cilindrada>adversario.cilindrada){ // Ganha o Carro por cilindrada
                    return this;
                } else if (this.cilindrada<adversario.cilindrada) { // Ganha o adversário por cilindrada
                    return adversario;
                }else{ // Empate de cilindrada
                    if(this.anoFabrico>adversario.anoFabrico){ // Ganha o Carro por recente
                        return this;
                    } else if (this.anoFabrico<adversario.anoFabrico) { // Ganha o adversário por recente
                        return adversario;
                    }
                }
            }
            return null;
        }

        public double consumo(int km){
            return km*consumo/100;
        }
    }