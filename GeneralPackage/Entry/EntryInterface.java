package GeneralPackage.Entry;

import GeneralPackage.Waiter.WaiterInterface;
import java.util.List;

public interface EntryInterface {

    public List<String> getMenuList();
    public void addToMenu(String name);
    public void placeOrder();

    public double getPaymentSummary();
    public void makePayment(double amount);
    public double getWaitTime();
    public void setDistance(double distance);

}
