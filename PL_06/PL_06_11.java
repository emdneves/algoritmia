/*11. Escreva uma função que leia um conjunto de números e os armazene num array. O array e a quantidade de números a ler são passados como argumento. 
Teste a função no âmbito de um programa que pergunte ao utilizador quantos números a ler e imprima o conteúdo do array. */

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

        printArr(size, list);

    }
    public static void printArr(int size, int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("array posição[" + i + "] :" + list[i]);
            }
        }

    }

