import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 

  {
    Scanner input = new Scanner(System.in);

              //getting input
    System.out.print("input hours: " + "\n");
    int hours = input.nextInt();

                  //getting input
    System.out.print("input minutes " + "\n");
    int minutes = input.nextInt();

      //closing the scanner 
    input.close();


        if (hours >= 12)
      System.out.println((hours - 12) + ":" + minutes + "PM");
    else
      System.out.println(hours + ":" + minutes + "AM");
     
  }
}