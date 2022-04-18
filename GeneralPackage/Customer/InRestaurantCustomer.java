/**
 * Group Num: 28
 * Student Names: Dominic Verschoor i6267365, Tantus Choomphupan i6286789
 *
 */


package GeneralPackage.Customer;

import GeneralPackage.Restaurant.Products.OrderInterface;
import GeneralPackage.Restaurant.RestaurantInterface;

public class InRestaurantCustomer extends Customer{
    boolean isPaid;

    public InRestaurantCustomer(RestaurantInterface restaurant) {
        super(restaurant);
        isPaid = false;
        restaurant.addToUnpaidList(this);
    }

    @Override
    public OrderInterface placeOrder() {
        waitTime = order.getCookTime();
        return super.placeOrder();
    }

    @Override
    public void makePayment() {
        super.makePayment();
        isPaid = true;
    }
}
