import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PL_08_08 {
    public static void main(String[] args) {

        String fileName = "exercicio_08.txt";
        try {

            String repeated = "programação";

            File file = new File(fileName); // creates an object File with the name of the file == name of the string
                                            // fileName
            File newFile = new File("teste_08.txt"); // creates an object newFile in the specified path

            Scanner scanner = new Scanner(file); // scanner to read the file
            PrintWriter printWriter = new PrintWriter(newFile); // scanner to print the new file

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine(); // reads the content of the file, line by line, while there are lines
                                                  // to be read
                System.out.println(line); // prints file in the console, line by line

                if (line.contains(repeated)) {
                    printWriter.println(line); // saves the line in a new file, line by line
                }

            }

            scanner.close(); // closing the scanner
            printWriter.close();

        } catch (IOException erro) {
            System.err.format("Erro na leitura do arquivo: %s", erro);
        }
    }
}
