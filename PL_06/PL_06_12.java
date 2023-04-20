/* 12. Escreva uma função que recebe uma string como parâmetro e retorna verdadeiro se a string é um palíndromo 
(ou seja, pode ser lida da mesma forma de trás para frente) e falso caso contrário. */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text:");
        String str = input.next();
        System.out.println(palindrome(str));
    }

    public static boolean palindrome(String str) {
        String[] arr = str.split("");
        int len = arr.length;

        if (len % 2 != 0) {
            arr[(len-1)/2] = "";
        }

        for (int i = 0; i < len/2; i++) {
            if (arr[i].equals(arr[len-i-1]) == false) {
                return false;
            }
        }

        return true;
    }
}


/* 
String str = "abc";
is equivalent to:

char data[] = {'a', 'b', 'c'};
     String str = new String(data); */