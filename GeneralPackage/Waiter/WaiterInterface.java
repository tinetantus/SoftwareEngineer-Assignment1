package GeneralPackage.Waiter;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public interface WaiterInterface {
    /**
     * Queue containing waiter instances representing the waiter/delivery person with next available waiter at the queue head
     */
    static Queue<Waiter> waiterQueue = new LinkedList<>();

    /**
     * Pass distance of the customer to the instance of the next availble waiter/delivery person
     * @param distance distance to delivery customer
     */
    public void deliverFood(double distance);

    /**
     * Get price summary adjusted for any pricing strategy from the kitchen after the customer has placed the order
     * @return amount summary that is due to the kitchen
     */
    public double getPaymentSummary();

    /**
     * Take the amount and pass the payment to the kitchen
     * @param amount amount to be paid to the kitchen equals to the price summary
     */
    public void makePayment(double amount);

    /**
     * Get list of menu option that the restaurant has and give to customer
     * @return list of available menu option name
     */
    public List<String> getMenuList();

    /**
     * Add this menu into the order list
     * @param name name of the menu to be sent to the kitchen
     */
    public void addToMenu(String name);

    /**
     * Place the order list made by customer ordering in the restaurant to the kitchen
     */
    public void placeOrder();

    /**
     * Method call when delivery person received the order and free the delivery person back to the queue
     */
    public void receiveFood();

    /**
     * Get time to destination base on actual distance given by the kitchen
     * @return time to destination
     */
    public double getTimeToDestination();

    /**
     * Get approximate time it takes to make delivery base on the distance and the delivery person speed
     * @param distance distance to approximate
     * @return time to destination of given distance
     */
    public double approxDriveTime(double distance);

    /**
     * Get the next available waiter/delivery person from the queue
     * @return instance of the waiter at the head of the queue
     */
    public static WaiterInterface getAvailableDriver() {
        return waiterQueue.peek();
    }

    /**
     * Adding a new instance of waiter into the queue
     * @param newWaiter
     */
    public static void addNewWaiter(WaiterInterface newWaiter) {
        waiterQueue.add((Waiter) newWaiter);
    }

}
