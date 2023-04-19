/* Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima na consola.
 */

 import java.io.File;
 import java.io.IOException;
 import java.util.Scanner;
 
 public class Main {
     public static void main(String[] args) {
         String fileName = "arquivo.txt"; // nome do arquivo
         try {
             File file = new File(fileName); // cria um objeto File com o nome do arquivo
             Scanner scanner = new Scanner(file); // cria um objeto Scanner para ler o arquivo
             while (scanner.hasNextLine()) { // lê linha por linha até o fim do arquivo
                 String line = scanner.nextLine();
                 System.out.println(line); // imprime a linha na console
             }
             scanner.close(); // fecha o scanner
         } catch (IOException e) {
             System.err.format("Erro na leitura do arquivo: %s%n", e);
         }
     }
 }
 