/* Escreva um programa que crie um ficheiro de texto e escreva nele uma mensagem. 
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PL_08_02 
{
    public static void main(String[] args) 
    {
        
        String fileContent = "Hello, welcome to APROGGGG."; 
        try 
        {
            File newFile = new File("C:\\Users\\sdev0223\\Documents\\GitHub\\algoritmia\\PL_08\\teste.txt");
            PrintWriter printWriter = new PrintWriter(newFile);
            printWriter.print(fileContent);
            printWriter.println();
            printWriter.printf("%d in a %s", 24, "row");
            printWriter.close();
        } catch (IOException erro) 
        {
            System.err.format("Erro na escrita do arquivo: %s%n", erro);
        }
    }
}