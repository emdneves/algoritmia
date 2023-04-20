/* 10. Escreva uma função que leia um valor inteiro positivo (deve solicitar números até que seja inteiro e positivo) 
e crie uma função que imprima numa linha um número de asteriscos igual ao valor inserido pelo utilizador. */

import java.util.Scanner;

class Main {

    public static void ast(int size) {
        for (int y = 0; y < size; y = y + 1)
            System.out.print("*");
    }

    public static void main(String[] args) {
        int size = 0;
        while (size <= 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number");
            size = input.nextInt();

// closing the scanner
input.close();
        }
        ast(size);
    }

}