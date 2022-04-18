package GeneralPackage.Customer.Entry;

import GeneralPackage.Customer.TakeawayCustomer;
import GeneralPackage.Restaurant.RestaurantInterface;

public class TakeAwayEntry extends Entry{
    public TakeAwayEntry(RestaurantInterface restaurant) {
        super(restaurant);
    }

    @Override
    public void createNewCustomer() {
        customer = new TakeawayCustomer(restaurant);
    }
}
