import java.util.ArrayList;
import java.util.List;

public class PizzaRestaurant {
    private List<Pizza> menu;

    public PizzaRestaurant() {
        this.menu = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        menu.add(pizza);
    }

    public void removePizza(Pizza pizza) {
        menu.remove(pizza);
    }

    public List<Pizza> getMenu() {
        return menu;
    }

    public void setMenu(List<Pizza> menu) {
        this.menu = menu;
    }

    public void printMenu() {
        System.out.println("Menu:");
        for (Pizza pizza : menu) {
            System.out.println(pizza.getName());
        }
    }
}

public class Ingredient {
    private String code;
    private String name;
    private Unit unit;
    private double calories;

    public Ingredient(String code, String name, Unit unit, double calories) {
        this.code = code;
        this.name = name;
        this.unit = unit;
        this.calories = calories;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}

public class Pizza {
    private String code;
    private String name;
    private String description;
    private double price;
    private PizzaSize size;
    private List<Ingredient> ingredients;

    public Pizza(String code, String name, String description, double price, PizzaSize size) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.size = size;
        this.ingredients = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    public int getNumberOfIngredients() {
        return ingredients.size();
    }
}

public enum Unit {
    GRAMAS("gramas"),
    LITROS("litros"),
    UNIDADES("unidades");

    private final String description;

    Unit(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public enum PizzaSize {
    PEQUENA("Pizza pequena"),
    MEDIA("Pizza média"),
    GRANDE("Pizza grande");

    private final String description;

    PizzaSize(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
