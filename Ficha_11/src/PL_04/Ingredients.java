package PL_04;

public class Ingredient {
    private String code;
    private String name;
    private UnidadeIngrediente unit;
    private int calories;

    public Ingredient(String code, String name, UnidadeIngrediente unit, int calories) {
        this.code = code;
        this.name = name;
        this.unit = unit;
        this.calories = calories;
    }

    // Getters and setters
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

    public UnidadeIngrediente getUnidadeIngrediente() {
        return unit;
    }

    public void setUnit(UnidadeIngrediente unit) {
        this.unit = unit;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    // Override toString() method to display the ingredient information
    @Override
    public String toString() {
        return "Ingredient{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", unit=" + unit +
                ", calories=" + calories +
                '}';
    }
}