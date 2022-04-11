import java.util.List;

public interface MenuItemInterface {
    public double getPrepTime();
    public double getMenuPrice();
    public List<IngredientInterface> getIngredientList();
    public void addIngredient(IngredientInterface ingredient);
    public String getItemName();
}
