package GeneralPackage.Restaurant.Products;

import java.util.List;

public interface OrderInterface {
    public List<MenuItemInterface> getMenuList();
    public double getCookTime();
    public void addMenuItem(MenuItemInterface menuItem);
    public double getTotalPrice();
}
