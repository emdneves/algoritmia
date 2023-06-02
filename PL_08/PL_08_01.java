/* Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima na consola.
 */

 import java.io.File;
 import java.io.IOException;
 import java.io.PrintWriter;
 import java.util.Scanner;
 
 public class PL_08_01 
 {
     public static void main(String[] args) 
     {
         String fileName = "exercicio_01_Alternativa01.txt"; 
         try 
         {
             File file = new File(fileName); // creates an object File with the name of the file == name of the string fileName
             Scanner scanner = new Scanner(file); // scanner to read the file
             while (scanner.hasNextLine()) 
             { // reads the content of the file, line by line, while there are lines to be read
                 String line = scanner.nextLine();
                 System.out.println(line); // prints file in the console, line by line
             }
             scanner.close(); // closing the scanner
         } catch (IOException erro) 
         {
             System.err.format("Erro na leitura do arquivo: %s%n", erro);
         }
     }
 }
 