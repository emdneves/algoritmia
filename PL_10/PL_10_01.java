//1. Atualize a classe Carro, para além de marca, modelo e ano, deve ter os seguintes parâmetros: potência,
//        cilindrada, tipoCombustivel, litros100Km.
//        a. Tipo Combustível deve ser uma enumeração: GASOLINA, DIESEL, GPL.
//        b. Altere o método ligar para que imprima uma mensagem de acordo com as seguintes
//        especificações:
//        c. Crie um método chamado corrida que receba um adversário como parâmetro e retorne o carro vencedor.
//        O vencedor é o carro com mais potência (caso seja a mesma o fator de desempate é a cilindrada (o maior ganha), caso contrário o fator de desempate é a idade (o mais recente ganha), caso contrário temos empate).
//        d. Crie um método que receba como parâmetro uma distância (em km), e que calcule o valor consumido em litros do combustível.
//        e. Teste a classe instanciando dois carros ao seu gosto e faça uma corrida entre os dois, imprima o vencedor. Seguidamente, calcule quanto é que os dois carros iam gastar numa viagem de 97km.
//        E imprima na consola quanto gastaria cada um, e qual dos dois é que ia gastar mais.

package PL_10;

public class PL_10_01 {

    public void ligar() {

    }

    public static void main(String[] args) {
        Carro carroDoTassio = new Carro("renault", "super 5", 1985, 50, 1000,"GASOLINA", 8.5 );
        Carro carroDoMendes = new Carro("ford", "fiesta turbo", 1990, 75, 1400,"DIESEL", 6.5 );

        

    }








