/**
 * Group Num: 28
 * Student Names: Dominic Verschoor i6267365, Tantus Choomphupan i6286789
 *
 */


package GeneralPackage.Customer;

import GeneralPackage.Restaurant.Products.MenuItemInterface;
import GeneralPackage.Restaurant.Products.OrderInterface;
import GeneralPackage.Restaurant.RestaurantInterface;

public interface CustomerInterface {
    public void addToOrder(MenuItemInterface menu);
    public OrderInterface placeOrder();
    public void makePayment();
    public int getID();
    public void getFood();
    public double getWaitTime();

    public double getAmountDue();

    public OrderInterface getOrder();

    public boolean isServed();

    public RestaurantInterface getRestaurant();


}
