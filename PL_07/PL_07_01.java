package PL_07;

public class PL_07_01 
{
    public static int fatorial(int num) 
    {
        if(num == 0) 
        {
            return 1;
        } 
        else 
        {
            return num * fatorial(num - 1);
        }
    }

/* 
O método fatorial recebe um número inteiro num como argumento.
O método primeiro verifica se num é igual a 0 usando uma instrução if. Se num for igual a 0, então o método retorna 1, pois o fatorial de 0 é definido como 1.
Se num não for igual a 0, então o método calcula o fatorial recursivamente retornando num multiplicado pelo fatorial de num - 1. 
Essa chamada recursiva para fatorial com num - 1 como argumento calcula o fatorial do número anterior.
A chamada recursiva continua até que num seja igual a 0, momento em que as chamadas recursivas param e o método começa a retornar os valores de volta pela pilha de chamadas, multiplicando cada valor pelo valor anterior.
Uma vez que todas as chamadas recursivas tenham sido concluídas, o valor final retornado pelo método fatorial é o fatorial do valor original de entrada num.
Por exemplo, se num for 4, o método fatorial irá executar os seguintes passos:

fatorial(4) retorna 4 * fatorial(3)
fatorial(3) retorna 3 * fatorial(2)
fatorial(2) retorna 2 * fatorial(1)
fatorial(1) retorna 1 * fatorial(0)
fatorial(0) retorna 1
Assim, o resultado final é 4 * 3 * 2 * 1 * 1, que é igual a 24.
*/









}





/*     
    public static void main(String[] args) 
    {
        System.out.println(fatorial(2));
    }
} */

