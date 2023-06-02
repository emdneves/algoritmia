package PL_03;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.Scanner;

public class Mota extends Veiculo {

    public Mota(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, double consumo) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, consumo);
    }

    public void imagem() {
        String file = "src/PL_03/Mota.txt";
        try {
            Scanner readFile = new Scanner(new File(file));
            while (readFile.hasNext()) {
                System.out.println(readFile.nextLine());
            }
            readFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Failed to read the file: " + file);
            e.printStackTrace();
        }
    }
}