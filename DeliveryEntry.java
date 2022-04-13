public class DeliveryEntry extends Entry{
    private double distance;

    public DeliveryEntry(RestaurantInterface restaurant) {
        super(restaurant);
    }

    @Override
    public void createNewCustomer() {
        customer = new DeliveryCustomer(restaurant, distance);
    }

    public void setDistance(double distance){
        this.distance = distance;
    }
}
