import java.util.List;

public class QREntry implements EntryInterface {
    RestaurantInterface restaurant;

    public QREntry(RestaurantInterface restaurant) {
        this.restaurant = restaurant;
        //InRestaurantCustomer customer = new InRestaurantCustomer(restaurant);
    }

    @Override
    public List<MenuItemInterface> menuList() {
        return null;
    }

    @Override
    public RestaurantInterface getRestaurant() {
        return null;
    }

    @Override
    public void placeOrder() {

    }
}
