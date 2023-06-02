import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PL_08_09 {
    public static void main(String[] args) {
        String fileName = "exercicio_09.txt";
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            // Lê todas as palavras do arquivo e armazena em um array
            String[] words = scanner.useDelimiter("\\s+").tokens().toArray(String[]::new);
            scanner.close();

            // Inicializa a matriz de contagem com zeros
            int[][] countMatrix = new int[words.length][2];
            for (int i = 0; i < words.length; i++) {
                countMatrix[i][0] = i;
                countMatrix[i][1] = 0;
            }

            // Percorre o array e conta a frequência de cada palavra
            for (int i = 0; i < words.length; i++) {
                for (int j = i; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        countMatrix[i][1]++;
                    }
                }
            }

            // Ordena a matriz pela frequência das palavras
            for (int i = 0; i < countMatrix.length; i++) {
                for (int j = i + 1; j < countMatrix.length; j++) {
                    if (countMatrix[i][1] < countMatrix[j][1]) {
                        int[] temp = countMatrix[i];
                        countMatrix[i] = countMatrix[j];
                        countMatrix[j] = temp;
                    }
                }
            }

            // Imprime as 10 palavras mais frequentes
            System.out.println("As 10 palavras mais frequentes no arquivo são:");
            for (int i = 0; i < 10; i++) {
                int index = countMatrix[i][0];
                int frequency = countMatrix[i][1];
                String word = words[index];
                System.out.printf("%d - %s (%d vezes)\n", i+1, word, frequency);
            }

        } catch (IOException erro) {
            System.err.format("Erro na leitura do arquivo: %s%n", erro);
        }
    }
}
