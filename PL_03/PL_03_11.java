import java.util.Scanner;

class Main 
{
public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);

      //getting input 1
    System.out.print("insert beginning: ");
    int beg = input.nextInt();

          //getting input 1
    System.out.print("insert end: ");
    int end = input.nextInt();

        //closing the scanner 
    input.close();
    
//------------------------------------
int x;
for (x = beg; (x % 5) != 0; x = x + 1);
    {
    System.out.println(x);
    }
        do
        {
        System.out.println(x);    
        x = x + 5;
        }
        while (x < end);
}
}

