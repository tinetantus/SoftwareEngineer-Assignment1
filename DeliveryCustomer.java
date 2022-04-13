public class DeliveryCustomer extends Customer{
    private double distanceInKM;
    private static final double SPEED = 5;

    public DeliveryCustomer(Restaurant restaurant, double distanceInKM) {
        super(restaurant);
        this.distanceInKM = distanceInKM;
    }

    @Override
    public OrderInterface placeOrder() {
        waitTime = order.getCookTime() + (distanceInKM*SPEED);
        makePayment();
        return super.placeOrder();
    }
}
