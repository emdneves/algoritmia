package PL_04;

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

/*
-------------------- getters e setters --------------------
*/
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

        /*
        -------------------- outrs métodos --------------------
        */
        public void addIngredient(Ingredient ingredient) {
            ingredients.add(ingredient);
        }

        public void removeIngredient(Ingredient ingredient) {
            ingredients.remove(ingredient);
        }

        public int getNumberOfIngredients() {
            return ingredients.size();
        }

        public void printDetails() {
            System.out.println("Pizza Code: " + code);
            System.out.println("Name: " + name);
            System.out.println("Description: " + description);
            System.out.println("Price: " + price);
            System.out.println("Size: " + size.getDescription());
            System.out.println("Ingredients:");
            for (Ingredient ingredient : ingredients) {
                System.out.println(ingredient.getName() + " - " + ingredient.getQuantity() + " " + ingredient.getUnit().getDescription());
            }
        }
    }
