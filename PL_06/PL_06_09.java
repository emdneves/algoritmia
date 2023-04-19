/* 9. Implemente um programa que contenha:
a. Uma função que pergunte o tamanho de um array a ser preenchido e o permita preencher.
b. Uma função com menu de opções que permitam invocar as funções desenvolvidas nos exercícios 6 a 8. */

import java.util.List;
import java.util.Scanner;

class Main {

//-----------------------------------------------------funções-----------------------------------------------------------//
    // função "crescente"
    public static boolean getInc(int[] arr) {
        int inc = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < inc) {
                inc = arr[i];
                count = 1;
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    // função "maior"
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // função "menor"
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
//-----------------------------------------------------funções-----------------------------------------------------------//
//-----------------------------------------------------menu-----------------------------------------------------------//

public static int menuOP(list[], int op) {
                    // menu de opções
            switch (op) {
                case 1:
                    // Invocar a função "maior"
                    return(getMax(list));
                    break;

                case 2:
                    // Invocar a função "menor"
                    return(getMin(list));
                    break;

                case 3:
                    // Invocar a função "crescente"
                    return (getInc(list));
                    break;

                default:

            }
        }


//-----------------------------------------------------menu-----------------------------------------------------------//

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
            System.out.println("Enter the array range");
            int size = input.nextInt();
            int[] list = new int[size];
    
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                list[i] = input.nextInt();
            }

            do {
                // getting option
                System.out.print("insert option:\n 1. maior\n 2. menor\n 3. crescente");
                int op = input.nextInt();

            } while ((op == 1) || (op == 2) || op == 3));


            System.out.println(menuOP(list, op));

        }
        





}
}