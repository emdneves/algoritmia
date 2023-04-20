/* 12. Escreva uma função que recebe uma string como parâmetro e retorna verdadeiro se a string é um palíndromo 
(ou seja, pode ser lida da mesma forma de trás para frente) e falso caso contrário. */

import java.util.Scanner;

class Main {
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        System.out.println("enter text");
        String str = input.next();

        System.out.println(palindromo(str));
    }

    public static Boolean palindromo(String[] str) 
    {
        int end = str.length;
        int x = 0;
        for (int i = 0; i < end; i++, end--) 
        {
            if (str[i] == str[end]) 
            {
                x++;
                if ((end / 2) == x) 
                {
                    return true;
                }
            }
            else 
            {
                return false;
            }
        }
    }
}

/* 
String str = "abc";
is equivalent to:

char data[] = {'a', 'b', 'c'};
     String str = new String(data); */