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
