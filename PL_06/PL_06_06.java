
// 6. Escreva uma função que recebe um array de inteiros como parâmetro e retorna o maior valor do array.

class Main

{

    static int max(int x[]) 
    {
        int max = 0;

        for (int i = 0; i < size; i++) 
        {
            if (x[i] > max) 
            {
                max = x[i];
            }
        }
        return max;
    }
}

    import java.util.Scanner;

    public static void main (String[] args) 
    {

    System.out.println("Enter the array range");  
    int size = input.nextInt();

    int list[size];

    System.out.println("Enter the elements of the array ::");  
    for(int i=0; i < size; i++) 
    {  
       list[i] = input.nextInt();  
    }
}
