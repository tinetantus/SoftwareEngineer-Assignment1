package GeneralPackage.Customer;

import GeneralPackage.Restaurant.Products.OrderInterface;
import GeneralPackage.Restaurant.RestaurantInterface;

public class TakeawayCustomer extends Customer{
    public TakeawayCustomer(RestaurantInterface restaurant) {
        super(restaurant);
    }

    @Override
    public OrderInterface placeOrder() {
        waitTime = order.getCookTime();
        makePayment();
        return super.placeOrder();
    }
}
