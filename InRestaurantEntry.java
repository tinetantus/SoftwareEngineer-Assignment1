public class InRestaurantEntry extends Entry {
    public InRestaurantEntry(RestaurantInterface restaurant) {
        super(restaurant);
    }

    @Override
    public void createNewCustomer() {
        customer = new InRestaurantCustomer(restaurant);
    }

}
