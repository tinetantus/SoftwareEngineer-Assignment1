package GeneralPackage.Restaurant.Products;

public class Ingredient implements IngredientInterface {
    private double price;
    private String name;

    public Ingredient(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
