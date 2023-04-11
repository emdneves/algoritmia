import java.util.Scanner;

class Main 
{
public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);

      //getting input 1
    System.out.print("insert limit: ");
    int limit = input.nextInt();

        //closing the scanner 
    input.close();

    int start = 0;
        while (start <= limit)
            {
            System.out.println(start);
            start = start + 1; 
            }

  }
}