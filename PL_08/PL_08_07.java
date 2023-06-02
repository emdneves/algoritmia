/* Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima o número de lines e o 
número de palavras presentes nesse ficheiro.  */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PL_08_07 
{
    public static void main(String[] args) 
    {
        try 
        {
            
            Scanner in = new Scanner(new File("exercicio_07.txt"));
            Scanner in2 = new Scanner(new File("exercicio_07.txt"));
            int lines = 0;
            int words = 0;


            while (in.hasNextLine()) 

            {
                in.nextLine(); // reads the content of the file, line by line, while there are lines to be read
                lines++;
            }


            while (in2.hasNext())
                {
                    in2.next();
                    words++;
                }

            System.out.println("number of lines is: " + lines);
            System.out.println("number of words is: " + words);

            in.close();

        } 
        catch (IOException erro) 
        {
            System.err.format("Erro na leitura do arquivo: %s%n", erro);
        }
    }
}



