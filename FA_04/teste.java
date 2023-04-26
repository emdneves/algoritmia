import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class teste {
    private static String[][] data;

    public static void main(String[] args) throws IOException {
        // read data from csv file
        File file = new File("GameStart.csv");
        Scanner scanner = new Scanner(file);
        String header = scanner.nextLine();
        int numLines = 0;


        while (scanner.hasNextLine()) {
            scanner.nextLine();
            numLines++;
        }

        scanner.close();
        data = new String[numLines][];
        scanner = new Scanner(file);
        scanner.nextLine(); // skip header
        for (int i = 0; i < numLines; i++) {
            data[i] = scanner.nextLine().split(";");
        }
        scanner.close();

        // show menu
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Game Store Menu");
            System.out.println("---------------");
            System.out.println("1. Print file");
            System.out.println("2. Number of sales");
            System.out.println("3. Total profit");
            System.out.println("4. Client information");
            System.out.println("5. Editor categories and games");
            System.out.println("6. Most expensive game and buyers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    printFile();
                    break;
                case 2:
                    printNumSales();
                    break;
                case 3:
                    printTotalProfit();
                    break;
/*                 case 4:
                    printClientInfo();
                    break;
                case 5:
                    printEditorInfo();
                    break;
                case 6:
                    printExpensiveGameInfo();
                    break; */
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
            System.out.println();
        } while (choice != 0);

        input.close();
    }

    private static void printFile() {
        System.out.println("Game Sales Data");
        System.out.println("-----------------------");
        System.out.println(String.join(";", data[0])); // print header
        for (int i = 1; i < data.length; i++) {
            System.out.println(String.join(";", data[i]));
        }
    }

    private static void printNumSales() {
        int numSales = data.length - 1; // exclude header
        double totalSales = 0.0;
        for (int i = 1; i < data.length; i++) {
            totalSales += Double.parseDouble(data[i][8]);
        }
        System.out.println("Number of sales: " + numSales);
        System.out.println("Total sales: " + totalSales);
    }

    private static void printTotalProfit() {
        double totalProfit = 0.0;
        for (int i = 1; i < data.length; i++) {
            totalProfit += Double.parseDouble(data[i][8]) * 0.1;
        }
        String formattedProfit = String.format("%.2f EUR", totalProfit);
        System.out.println("Total profit: " + formattedProfit);
    }
    







}
