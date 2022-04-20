/**
 * Software Engineer Assignment 2
 * Group 28
 * Student 1: Tantus Choomphupan i6286789
 * Student 2: Dominic Verschoor i6267365
 */

package GeneralPackage.Kitchen;

import java.util.List;

public interface KitchenInterface {
    /**
     * Get menu list of option the restaurant has
     * @return list of menu option
     */
    public List<String> getMenuList();

    /**
     * Get the amount due of the current customer
     * @return amount due
     */
    public double getAmountDue();

    /**
     * Calculate the price from the customer order and apply all pricing strategy
     * @return new amount due
     */
    public double getPriceSummary();

    /**
     * Get the combined cook time of all the menu in the customer order
     * @return cook time in minutes
     */
    public double getWaitTime();

    /**
     * Method called by entry interfaces or waiter to translate string list into MenuItem list
     * @param order customer order
     */
    public void placeOrder(List<String> order);

    /**
     * Method call by entry interfaces or waiter to pass add due amount to the restaurant bank account
     * @param amount
     */
    public void makePayment(double amount);

    /**
     * Method called by delivery entry interface to set the distance to delivery location of the customer
     * @param distance
     */
    public void setDistance(double distance);

    /**
     * Call when the order is ready to be served to get next available waiter to make delivery
     */
    public void deliverFood();

    /**
     * Get approximate delivery time of the current customer
     * @return delivery time
     */
    public double getDriveTime();

}
