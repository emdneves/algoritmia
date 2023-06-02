import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    //getting musica 1
    System.out.print("duração música 1: ");
    double dur1 = input.nextDouble();

    //getting musica 2
    System.out.print("duração música 2: ");
    double dur2 = input.nextDouble();

    //getting musica 3
    System.out.print("duração música 3: ");
    double dur3 = input.nextDouble();

    //getting musica 4
    System.out.print("duração música 4: ");
    double dur4 = input.nextDouble();

    //getting musica 5
    System.out.print("duração música 5: ");
    double dur5 = input.nextDouble();

     //closing the scanner 
    input.close();

     // separar valores musica 1
    double segundos1 = (dur1 % 1);
    double minutos1 = (dur1 - segundos1);
    double segundos_conv1 = (segundos1 * 100);

         // separar valores musica 2
    double segundos2 = (dur2 % 1);
    double minutos2 = (dur2 - segundos2);
    double segundos_conv2 = (segundos2 * 100);

        // separar valores musica 3
    double segundos3 = (dur3 % 1);
    double minutos3 = (dur3 - segundos3);
    double segundos_conv3 = (segundos3 * 100);

             // separar valores musica 4
    double segundos4 = (dur4 % 1);
    double minutos4 = (dur4 - segundos4);
    double segundos_conv4 = (segundos4 * 100);

                 // separar valores musica 5
    double segundos5 = (dur5 % 1);
    double minutos5 = (dur5 - segundos5);
    double segundos_conv5 = (segundos5 * 100);
 

    // converter em minutos e segundos
    double total_segundos = (segundos_conv1 + segundos_conv2 + segundos_conv3 + segundos_conv4 + segundos_conv5);  
    double total_minutos = (minutos1 + minutos2 + minutos3 + minutos4 + minutos5); 
    double resto_segundos = (total_segundos / 60);
    double minutos_separados = (resto_segundos - (resto_segundos % 1));
    double segundos_final = (total_segundos - (minutos_separados * 60));
    double minutos_final = (total_minutos + minutos_separados);
   
    System.out.println("duração = " + minutos_final + ":" + segundos_final);

  }
}