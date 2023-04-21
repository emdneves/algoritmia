/* Escreva um programa que leia um ficheiro de texto contendo números inteiros separados por espaço e 
calcule a soma desses números. 
 */

 import java.io.File;
 import java.io.IOException;
 import java.io.PrintWriter;
 import java.util.Scanner;
 
 public class PL_08_05 
 {
     public static void main(String[] args) 
     {
         String fileName = "exercicio_05.txt"; 
         try 
         {
             File file = new File(fileName); // creates an object File with the name of the file == name of the string fileName
             Scanner scanner = new Scanner(file); // scanner to read the file

            int count = 0;
             while (scanner.hasNextLine()) 
             { // reads the content of the file, line by line, while there are lines to be read
                 int line = scanner.nextInt();
                 System.out.println(line); // prints file in the console, line by line
                 count += line;
                 System.out.println("total parcial: " + count);
             }
             scanner.close(); // closing the scanner
             System.out.println("total final: " + count);

         } catch (IOException erro) 
         {
             System.err.format("Erro na leitura do arquivo: %s%n", erro);
         }
     }
 }
 