import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

      //getting input 1
    System.out.print("Insert employee ID: ");
    int cod_func = input.nextInt();
    System.out.println("ID: " + cod_func);

      //getting input 2
    System.out.print("Insert days of work: ");
    int dias = input.nextInt();
    System.out.println("Days: " + dias);

      //closing the scanner 
    input.close();

      // declarar conceitos
    double base = (40);
    double sub_alim = (5);
    double irs = (0.1) ; 
    double ss_func = 0.11;
    double ss_patr = 0.2375;    

      //dados a apresentar

    double bruto = (base * dias);
    double sub_alim_total = (sub_alim * dias);
    double irs_total = ((bruto + sub_alim) * irs);
    double ss =  (((bruto + sub_alim) * ss_func) + ((bruto + sub_alim) * ss_patr));
    double liq = (bruto + sub_alim - irs - ss);
    double enc = (bruto + sub_alim + irs + ss);
       
    System.out.println("valor bruto a receber fruto do vencimento pelo funcionário " + cod_func + ": " + bruto + " €");
    System.out.println("total subsído de alimentação = " + sub_alim_total + " €");
    System.out.println("valor de IRS a entrgar ao estado = " + irs_total + " €");
    System.out.println("valor total a entregar à segurança Social = " + ss + " €");    
    System.out.println("valor líquido a receber pelo funcionário " + cod_func + ": " + liq + " €");
    System.out.println("valor total do encargo para a empresa pelo funcionário " + cod_func + ": "  + enc + " €");    
  }
}