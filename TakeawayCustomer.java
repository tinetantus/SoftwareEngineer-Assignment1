
public class TakeawayCustomer extends Customer{
    public TakeawayCustomer(Restaurant restaurant) {
        super(restaurant);
    }

    @Override
    public OrderInterface placeOrder() {
        waitTime = order.getCookTime();
        makePayment();
        return super.placeOrder();
    }
}
