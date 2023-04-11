import java.util.Scanner;

class Main 
{
public static void main(String[] args) 
{

Scanner scanner = new Scanner(System.in); 



System.out.print("Insira um número inteiro positivo: ");
int num= scanner.nextInt();

System.out.print("Os divisores de + num + são: ");
for (int i = 1; i <= num; i++) { 
    for(int h=1; h<2;h++) {
    if (num % i == 0) {

System.out.print(i + " ");
}}}
}}