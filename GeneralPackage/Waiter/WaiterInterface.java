package GeneralPackage.Waiter;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public interface WaiterInterface {

    static Queue<Waiter> waiterQueue = new LinkedList<>();

    public void deliverFood(double distance);
    public double getPaymentSummary();
    public void makePayment(double amount);
    public List<String> getMenuList();
    public void addToMenu(String name);
    public void placeOrder();
    public void receiveFood();

    public double getTimeToDestination();

    public double approxDriveTime(double distance);

    public static WaiterInterface getAvailableDriver() {
        return waiterQueue.peek();
    }

    public static void addNewWaiter(WaiterInterface newWaiter) {
        waiterQueue.add((Waiter) newWaiter);
    }


}
