package GeneralPackage.Entry;
import GeneralPackage.Kitchen.KitchenInterface;

import java.util.List;

public interface EntryInterface {
    public List<MenuItemInterface> menuList();
    public RestaurantInterface getRestaurant();
    public OrderInterface placeOrder();
    public void createNewCustomer();
}