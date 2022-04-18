package GeneralPackage.Customer.Entry;

import GeneralPackage.Restaurant.Products.MenuItemInterface;
import GeneralPackage.Restaurant.Products.OrderInterface;
import GeneralPackage.Restaurant.RestaurantInterface;

import java.util.List;

public interface EntryInterface {
    public List<MenuItemInterface> menuList();
    public RestaurantInterface getRestaurant();
    public OrderInterface placeOrder();
    public void createNewCustomer();
}
