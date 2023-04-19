//8. Escreva uma função que recebe um array de inteiros como parâmetro e retorna se o array está crescente.

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

        boolean ordem = getInc(list);
        System.out.println("A sequência está em ordem crescente : " + ordem);
        // closing the scanner
        input.close();
    }

    public static boolean getInc(int[] arr) {
        int inc = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < inc) {
                inc = arr[i];
                count = 1;
            }
        }
        if (count == 0) 
        {
            return true;
        } else 
        {
            return false;
        }
    }
}