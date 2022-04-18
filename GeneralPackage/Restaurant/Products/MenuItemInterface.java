/**
 * Group Num: 28
 * Student Names: Dominic Verschoor i6267365, Tantus Choomphupan i6286789
 *
 */


package GeneralPackage.Restaurant.Products;

import java.util.List;

public interface MenuItemInterface {
    public double getPrepTime();
    public double getMenuPrice();
    public List<IngredientInterface> getIngredientList();
    public void addIngredient(IngredientInterface ingredient);
    public String getItemName();

    public String getType();
}
