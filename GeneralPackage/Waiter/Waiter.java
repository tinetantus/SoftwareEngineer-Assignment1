/**
 * Group Num: 28
 * Student Names: Dominic Verschoor i6267365, Tantus Choomphupan i6286789
 *
 */


package GeneralPackage.Waiter;

import GeneralPackage.Customer.CustomerInterface;
import GeneralPackage.Restaurant.RestaurantInterface;

public class Waiter implements  WaiterInterface{
    public Waiter(RestaurantInterface restaurant){

    }

    @Override
    public void takePayment(CustomerInterface customer) {
        customer.makePayment();
    }
}
