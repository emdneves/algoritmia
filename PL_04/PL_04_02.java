import java.util.Scanner;

class Main {
    public static void main(String[] args) 
    {

        String op;
        Scanner input = new Scanner(System.in);
        do 
        {
            // getting option
            System.out.print("insert option:\n 1. create\n 2. update\n 3. delete\n 4. exit");
            op = input.next();

            //
            switch (op) 
            {
                case "1":
                    System.out.println("1.create\n ");
                    break;
                case "2":
                    System.out.println("2.update\n ");
                    break;
                case "3":
                    System.out.println("3.delete\n ");
                    break;
                case "4":
                    System.out.println("4.exit\n ");
                    break;
                default:
                    System.out.println("erro\n ");
            }
        } 
        while (op.equals("1") || op.equals("2") || op.equals("3"));

        // closing the scanner
        input.close();
    }
}