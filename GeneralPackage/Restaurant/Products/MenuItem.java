/**
 * Group Num: 28
 * Student Names: Dominic Verschoor i6267365, Tantus Choomphupan i6286789
 *
 */


package GeneralPackage.Restaurant.Products;

import java.util.List;

public class MenuItem implements MenuItemInterface {
    public enum ItemType{
        DRINK {
            @Override
            public java.lang.String toString() {
                return "DRINK";
            }
        },

        MAIN {
            @Override
            public java.lang.String toString() {
                return "MAIN";
            }
        },

        SIDE {
            @Override
            public java.lang.String toString() {
                return "SIDE";
            }
        },

        DESSERT {
            @Override
            public java.lang.String toString() {
                return "DESSERT";
            }
        }
    }

    private double prepTime;
    private double menuPrice;
    private String itemName;
    private String type; // ["Drink", "Main", "Side", "Desert"]
    private List<IngredientInterface> ingredientList;


    public MenuItem(String itemName, List<IngredientInterface> ingredientList, double prepTime, ItemType type) {
        this.itemName = itemName;
        this.prepTime = prepTime;
        this.type = type.toString();
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

    @Override
    public String getType() {
        return type;
    }
}
