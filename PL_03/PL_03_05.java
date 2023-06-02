class Main 
{
public static void main(String[] args) 
{
int soma = 0;
for (int inicial = 1; inicial <= 10; inicial = inicial + 1) 
    {
    System.out.println(inicial + " | " + soma);
    soma = soma + inicial;
    }
System.out.println("Soma: " + soma);
}
}