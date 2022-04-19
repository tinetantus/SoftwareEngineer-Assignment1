package GeneralPackage.Kitchen;

import GeneralPackage.Waiter.WaiterInterface;
import java.util.List;

public interface KitchenInterface {
    public List<String> getMenuList();
    public double getAmountDue();
    public double getPriceSummary();
    public double getWaitTime();
    public void placeOrder(List<String> order);
    public void makePayment(double amount);

    public void setDistance(double distance);

    public void deliverFood();

    public double getDriveTime();

}
