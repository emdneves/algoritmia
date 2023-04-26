import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class teste2 {
    private static String[][] data;
    private static int numRows;
    private static int numColumns;

    public static void main(String[] args) {
        readFile();
        menu();
    }

    private static void readFile() {
        try {
            File csvFile = new File("GameStart.csv");
            Scanner scanner = new Scanner(csvFile);

            // Get number of rows and columns in the CSV file
            numRows = 0;
            numColumns = scanner.nextLine().split(";").length;
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                numRows++;
            }

            // Create 2D array to store CSV data
            data = new String[numRows][numColumns];

            // Reset scanner to read from beginning of file
            scanner = new Scanner(csvFile);

            // Store CSV data in 2D array
            for (int i = 0; i < numRows; i++) {
                String[] line = scanner.nextLine().split(";");
                for (int j = 0; j < numColumns; j++) {
                    data[i][j] = line[j];
                }
            }

            // Close scanner
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 7) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Print the CSV file");
            System.out.println("2. Print the number of sales and total revenue");
            System.out.println("3. Calculate the total profit");
            System.out.println("4. Print client information");
            System.out.println("5. Print categories and games by editor");
            System.out.println("6. Print the most expensive game and its clients");
            System.out.println("7. Exit");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                continue;
            }

            switch (choice) {
                case 1:
                    printCsv();
                    break;
                case 2:
                    printSalesInfo();
                    break;
/*                 case 3:
                    printTotalProfit();
                    break;
                case 4:
                    printClientInfo();
                    break;
                case 5:
                    printCategoriesAndGames();
                    break;
                case 6:
                    printMostExpensiveGame();
                    break; */
                case 7:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }

        scanner.close();
    }

    private static void printCsv() {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void printSalesInfo() {
        int numSales = numRows - 1;
        double totalRevenue = 0.0;

        for (int i = 1; i < numRows; i++) {
            totalRevenue += Double.parseDouble(data[i][numColumns - 1]);
        }

        System.out.printf("Number of sales: %d\n", numSales);
        System.out.printf("Total revenue: %.2f\n", totalRevenue);
    }
}
