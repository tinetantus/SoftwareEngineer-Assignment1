/**
 * Group Num: 28
 * Student Names: Dominic Verschoor i6267365, Tantus Choomphupan i6286789
 *
 */


package GeneralPackage.Restaurant.Products;

import java.util.List;

public interface OrderInterface {
    public List<MenuItemInterface> getMenuList();
    public double getCookTime();
    public void addMenuItem(MenuItemInterface menuItem);
    public double getTotalPrice();
}
