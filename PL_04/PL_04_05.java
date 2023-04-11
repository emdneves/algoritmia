import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
   
      //getting input 1
    System.out.print("Insert employee ID: ");
    int cod_func = input.nextInt();
     
      //getting input 2
    String position;

      System.out.print("Insert position: ");
      position = input.next();

      //getting input 3
    System.out.print("Insert days of work: ");
    double days = input.nextDouble();
  
      //closing the scanner 
    input.close();

    System.out.println("o funcionário " + cod_func + " com o cargo " + position + " teve os seguintes encargos e rendimentos");   

      switch (position) 
    {
    case "E":
      {
      //valor bruto a receber
      double bruto = (days * 40);
      System.out.println("valor de subsidio de alimentação: " + bruto + "€");  
      
      //valor de subsidio de alimentação
      double sa = (days * 5);
      System.out.println("valor de subsidio de alimentação: " + sa + "€");  

      double bruto_sa = sa + bruto;
      
        //valor da retenção IRS a entregar ao estado
      double ss;
      double irs;
      
      if (bruto_sa < 1000 ) 
      {
        ss = ((bruto_sa * 0.11) + (bruto_sa * .2375));
        irs = (bruto_sa * 0.10);
        System.out.println("valor de IRS a entregar ao estado: " + irs + "€");  
        System.out.println("valor total a entregar à segurança social: " + ss + "€");
        System.out.println("valor liquido a receber: " + (bruto_sa - irs - ss) + "€");
            }
      else 
      {
        ss = ((bruto_sa * 0.11) + (bruto_sa * 0.2375));
        irs = (bruto_sa * 0.20);
        System.out.println("valor de IRS a entregar ao estado: " + irs + "€");  
        System.out.println("valor total a entregar à segurança social: " + ss + "€");
        System.out.println("valor liquido a receber: " + (bruto_sa - irs - ss) + "€");
      }
    break;
    }
         
    case "C": 
      {
      //valor bruto a receber
      double bruto = (days * 60);
      System.out.println("valor de subsidio de alimentação: " + bruto + "€");  
      
      //valor de subsidio de alimentação
      double sa = (days * 7.5);
      System.out.println("valor de subsidio de alimentação: " + sa + "€");  

      double bruto_sa = sa + bruto;
      
        //valor da retenção IRS a entregar ao estado
      double ss;
      double irs;
      
      if (bruto_sa < 1000 ) 
      {
        ss = ((bruto_sa * 0.11) + (bruto_sa * .2375));
        irs = (bruto_sa * 0.10);
        System.out.println("valor de IRS a entregar ao estado: " + irs + "€");  
        System.out.println("valor total a entregar à segurança social: " + ss + "€");
        System.out.println("valor liquido a receber: " + (bruto_sa - irs - ss) + "€");
      }
      else 
      {
        ss = ((bruto_sa * 0.11) + (bruto_sa * 0.2375));
        irs = (bruto_sa * 0.20);
        System.out.println("valor de IRS a entregar ao estado: " + irs + "€");  
        System.out.println("valor total a entregar à segurança social: " + ss + "€");
        System.out.println("valor liquido a receber: " + (bruto_sa - irs - ss) + "€");
      }
    break;
    }
      case "A": 
      {
      //valor bruto a receber
      double bruto = (days * 80);
      System.out.println("valor de subsidio de alimentação: " + bruto + "€");  
      
      //valor de subsidio de alimentação
      double sa = (days * 7.5);
      System.out.println("valor de subsidio de alimentação: " + sa + "€");  

      double bruto_sa = sa + bruto;
      
        //valor da retenção IRS a entregar ao estado
      double ss;
      double irs;
      
      if (bruto_sa < 1000 ) {
        ss = ((bruto_sa * 0.09) + (bruto_sa * .21));
        irs = (bruto_sa * 0.10);
        System.out.println("valor de IRS a entregar ao estado: " + irs + "€");  
        System.out.println("valor total a entregar à segurança social: " + ss + "€");
        System.out.println("valor liquido a receber: " + (bruto_sa - irs - ss) + "€");
      }
      else 
      {
        ss = ((bruto_sa * 0.09) + (bruto_sa * .21));
        irs = (bruto_sa * 0.20);
        System.out.println("valor de IRS a entregar ao estado: " + irs + "€");  
        System.out.println("valor total a entregar à segurança social: " + ss + "€");
        System.out.println("valor liquido a receber: " + (bruto_sa - irs - ss) + "€");
      }
      break;
      }
    default:;
    }   
  }
}