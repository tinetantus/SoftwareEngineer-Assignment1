import java.util.List;

public class MenuItem implements MenuItemInterface {
    private double prepTime;
    private double menuPrice;
    private String itemName;
    private List<IngredientInterface> ingredientList;

    public MenuItem(String itemName, List<IngredientInterface> ingredientList, double prepTime) {
        this.itemName = itemName;
        this.prepTime = prepTime;
        this.ingredientList = ingredientList;
        for (IngredientInterface ingredient: ingredientList) {
            menuPrice += ingredient.getPrice();
        }
    }

    @Override
    public void addIngredient(IngredientInterface ingredient) {
        ingredientList.add(ingredient);
        menuPrice += ingredient.getPrice();
    }

    @Override
    public double getPrepTime() {
        return prepTime;
    }

    @Override
    public double getMenuPrice() {
        return menuPrice;
    }

    @Override
    public List<IngredientInterface> getIngredientList() {
        return ingredientList;
    }

    @Override
    public String getItemName() {
        return itemName;
    }
}
