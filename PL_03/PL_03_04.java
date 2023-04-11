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
    System.out.print("insert limit: ");
    int limit = input.nextInt();

        //closing the scanner 
    input.close();

    int start = beg;
        while (start <= limit)
            {
            System.out.println(start);
            start = start + 1; 
            }

  }
}