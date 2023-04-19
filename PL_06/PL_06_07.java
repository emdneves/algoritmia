// 7. Escreva uma função que recebe um array de inteiros como parâmetro e retorna o menor valor do array.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array range");
        int size = input.nextInt();
        int[] list = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }

        int min = getMin(list);
        System.out.println("The minimum value in the array is: " + min);
        // closing the scanner
        input.close();
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}