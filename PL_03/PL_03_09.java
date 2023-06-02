import java.util.Scanner;

class Main 
{
public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);

      //getting input 1
    System.out.print("insert limit: ");
    int limit = input.nextInt();
      //getting input 2
    System.out.print("insert increment: ");
    int increment = input.nextInt();

        //closing the scanner 
    input.close();

    int start = (- increment);
        while (start < (limit - increment))
            {
            System.out.println(start + increment);
            start = start + increment;
            }
  }
}