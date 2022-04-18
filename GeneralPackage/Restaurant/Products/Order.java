package GeneralPackage.Restaurant.Products;

import java.util.ArrayList;
import java.util.List;

public class Order implements OrderInterface {
    private List<MenuItemInterface> menuList;
    private double cookTime;
    private double totalPrice;

    public Order() {
        menuList = new ArrayList<>();
        cookTime = 0;
    }

    @Override
    public List<MenuItemInterface> getMenuList() {
        return menuList;
    }

    @Override
    public double getCookTime() {
        return cookTime;
    }

    @Override
    public void addMenuItem(MenuItemInterface menuItem) {
        menuList.add(menuItem);
        cookTime += menuItem.getPrepTime();
        totalPrice += menuItem.getMenuPrice();
    }

    @Override
    public double getTotalPrice() {
        return totalPrice;
    }
}
