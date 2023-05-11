// Num projeto poo_fp11, com um package poo_fp11.bikeStore, implemente o código Java necessário para representar a estrutura descrita. 
// Tenha por referência o seguinte excerto da estrutura de classes:

/* a. Deve garantir o encapsulamento de todas as classes criadas;
b. Deve criar métodos de acesso necessários para todas as classes criadas;
c. Para as coleções de ferramentas (BikeTool) e patrocinadores (Sponsors), deverá criar métodos que permitam o acesso controlado a cada uma das coleções. 
Por exemplo, deverá criar métodos de inserção, edição, remoção e listagem de elementos.
d. Crie a classe BikeDemo e teste as classes implementadas, inicializando alguns elementos relativo a bicicletas de montanha e bicicletas de carga/distribuição.
e. Crie uma classe BicycleManagment que armazene um vetor de bicicletas ( Bicycle[] ). Crie um método para adicionar bicicletas ao vetor até a um máximo de 20. 
De seguida e utilizando a classe BikeDemo , teste a classe criada, adicionando as bicicletas que criou na alínea 
a. Crie ainda um método na classe BicycleManagment que imprima todos os dados das bicicletas contidas no vetor que criou. */

package PL_11;

class PL_11_01 
{



import java.util.ArrayList;
import java.util.List;



/* -----------------------------------------BICYCLE CLASS----------------------------------------- */    

class Bicycle {
    private int id;
    private int numberOfGears;
    private String mainColor;
    private double wheelSize;
    private double bikeLength;
    private boolean adjustableSeatpost;
    private double price;

    public Bicycle(int id, int numberOfGears, String mainColor, double wheelSize, double bikeLength,
                   boolean adjustableSeatpost, double price) {
        this.id = id;
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.wheelSize = wheelSize;
        this.bikeLength = bikeLength;
        this.adjustableSeatpost = adjustableSeatpost;
        this.price = price;
    }


/* -----------------------------------------BICYCLE GETTERS ----------------------------------------- */    

public int getId() {
    return id;
}

public int getNumberOfGears() {
    return numberOfGears;
}

public String getMainColor() {
    return mainColor;
}

public double getWheelSize() {
    return wheelSize;
}

public double getBikeLength() {
    return bikeLength;
}

public boolean isAdjustableSeatpost() {
    return adjustableSeatpost;
}

public double getPrice() {
    return price;
}

/* -----------------------------------------BICYCLE SETTERS----------------------------------------- */    

public void setId(int id) {
    this.id = id;
}

public void setNumberOfGears(int numberOfGears) {
    this.numberOfGears = numberOfGears;
}

public void setMainColor(String mainColor) {
    this.mainColor = mainColor;
}

public void setWheelSize(double wheelSize) {
    this.wheelSize = wheelSize;
}

public void setBikeLength(double bikeLength) {
    this.bikeLength = bikeLength;
}

public void setAdjustableSeatpost(boolean adjustableSeatpost) {
    this.adjustableSeatpost = adjustableSeatpost;
}

public void setPrice(double price) {
    this.price = price;
}
}

/* -----------------------------------------CLASS MOUNTAIN BIKE----------------------------------------- */    


class MountainBike extends Bicycle {
    private int numberOfLights;
    private String suspension;
    private List<String> bikeTools;

    public MountainBike(int id, int numberOfGears, String mainColor, double wheelSize, double bikeLength,
                        boolean adjustableSeatpost, double price, int numberOfLights, String suspension,
                        List<String> bikeTools) {
        super(id, numberOfGears, mainColor, wheelSize, bikeLength, adjustableSeatpost, price);
        this.numberOfLights = numberOfLights;
        this.suspension = suspension;
        this.bikeTools = bikeTools;
    }


}


/* -----------------------------------------CLASS CARGO BIKE----------------------------------------- */    

class CargoBike extends Bicycle {
    private boolean isFrontBasket;
    private double basketCapacity;
    private List<String> sponsors;

    public CargoBike(int id, int numberOfGears, String mainColor, double wheelSize, double bikeLength,
                     boolean adjustableSeatpost, double price, boolean isFrontBasket, double basketCapacity,
                     List<String> sponsors) {
        super(id, numberOfGears, mainColor, wheelSize, bikeLength, adjustableSeatpost, price);
        this.isFrontBasket = isFrontBasket;
        this.basketCapacity = basketCapacity;
        this.sponsors = sponsors;
    }


/* -----------------------------------------CARGO BIKE GETTERS ----------------------------------------- */    

/* public int isFrontBasket() {
    return isFrontBasket;
}

public int basketCapacity() {
    return basketCapacity;
}

public String sponsors() {
    return sponsors;
} */


/* -----------------------------------------CARGO BIKE SETTERS----------------------------------------- */    

/* public void setId(int isFrontBasket) {
    this.isFrontBasket = isFrontBasket;
}

public void setbBasketCapacity(int basketCapacity) {
    this.basketCapacity = basketCapacity;
}

public void setSponsors(String sponsors) {
    this.sponsors = sponsors;
}
} */



/* -----------------------------------------MAIN----------------------------------------- */    

public static void main(String[] args) {
    // Create a list to store the available bicycles
    List<Bicycle> bicycles = new ArrayList<>();

    // Create a mountain bike
    MountainBike mountainBike = new MountainBike(1, 24, "Red", 26, 180, true, 500.0,
            2, "Dual Suspension", new ArrayList<>());
    mountainBike.addBikeTool("Water Bottle");
    mountainBike.addBikeTool("Tire Repair Kit");

    // Create a cargo bike
    CargoBike cargoBike = new CargoBike(2, 8, "Blue", 28, 200, false, 800.0,
            true, 50.0, new ArrayList<>());
    cargoBike.getSponsors().add("Company A");
    cargoBike.getSponsors().add("Company B");

    // Add the bikes to the list
    bicycles.add(mountainBike);
    bicycles.add(cargoBike);

    // Display information about each bike
    for (Bicycle bike : bicycles) {
        System.out.println("Bike ID: " + bike.getId());
        System.out.println("Number of Gears: " + bike.getNumberOfGears());
        System.out.println("Main Color: " + bike.getMainColor());
        System.out.println("Wheel Size: " + bike.getWheelSize());
        System.out.println("Bike Length: " + bike.getBikeLength());
        System.out.println("Adjustable Seatpost: " + bike.isAdjustableSeatpost());
        System.out.println("Price: $" + bike.getPrice());

        if (bike instanceof MountainBike) {
            MountainBike mountainBike = (MountainBike) bike;
            System.out.println("Number of Lights: " + mountainBike.getNumberOfLights());
            System.out.println("Suspension: " + mountainBike.getSuspension());
            System.out.println("Bike Tools: " + mountainBike.getBikeTools());
        } else if (bike instanceof CargoBike) {
            CargoBike cargoBike = (CargoBike) bike;
            System.out.println("Front Basket: " + cargoBike.isFrontBasket());
            System.out.println("Basket Capacity: " + cargoBike.getBasketCapacity());
            System.out.println("Sponsors: " + cargoBike.getSponsors());
        }

        System.out.println();
    }
}
}

