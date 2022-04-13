import java.util.List;

public class Entry implements EntryInterface {
    RestaurantInterface restaurant;
    CustomerInterface customer;

    public Entry(RestaurantInterface restaurant) {
        this.restaurant = restaurant;
    }

    public void addToOrder(MenuItemInterface menu) {
        customer.addToOrder(menu);
    }

    @Override
    public OrderInterface placeOrder() {
        return customer.placeOrder();
    }

    @Override
    public void createNewCustomer() {

    }

    @Override
    public List<MenuItemInterface> menuList() {
        return restaurant.getMenuItemList();
    }

    @Override
    public RestaurantInterface getRestaurant() {
        return restaurant;
    }
}
