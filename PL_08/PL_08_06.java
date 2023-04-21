/* Escreva um programa que leia um ficheiro de texto contendo nomes e idades separados por vírgulas e 
imprima o nome da pessoa mais velha na consola.  */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PL_08_06 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("exercicio_06.txt")); // scanner to read the file

            int menorIdade = 0;
            String[] teste = new String[2];

            while (in.hasNextLine()) { // reads the content of the file, line by line, while there are lines to be read

                String line = in.nextLine();

                String[] lista = line.split(",");

                int idade = Integer.parseInt(lista[1]);

                if (idade > menorIdade) {
                    menorIdade = idade;
                    teste[0] = lista[0];
                    teste[1] = lista[1];
                }

            }

            System.out.println("A idade da pesso mais velha na lista é: " + teste[0] +  teste[1]);
            in.close(); // closing the scanner

        } catch (IOException erro) {
            System.err.format("Erro na leitura do arquivo: %s%n", erro);
        }
    }
}