/**
 * Software Engineer Assignment 2
 * Group 28
 * Student 1: Tantus Choomphupan i6286789
 * Student 2: Dominic Verschoor i6267365
 */
package GeneralPackage.Waiter;

import GeneralPackage.Kitchen.KitchenInterface;
import java.util.*;

public class Waiter implements WaiterInterface{

    KitchenInterface kitchen;
    List<String> order;
    private double timeToDestination;

    private static final double SPEED = 5;

    public Waiter (KitchenInterface kitchen) {
        this.kitchen = kitchen;
        order = new ArrayList<>();
    }

    @Override
    public void deliverFood(double distance) {
        timeToDestination = distance/SPEED;
        waiterQueue.remove();
    }

    @Override
    public double getPaymentSummary() {
        return kitchen.getPriceSummary();
    }

    @Override
    public void makePayment(double amount) {
        kitchen.makePayment(amount);
    }

    @Override
    public List<String> getMenuList() {
        return kitchen.getMenuList();
    }

    @Override
    public void addToMenu(String name) {
        order.add(name);
    }

    @Override
    public void placeOrder() {
        kitchen.placeOrder(order);
        order = new ArrayList<>();
    }

    @Override
    public void receiveFood() {
        waiterQueue.add(this);
    }

    @Override
    public double getTimeToDestination() {
        return timeToDestination;
    }

    @Override
    public double approxDriveTime(double distance){
        return distance/SPEED;
    }



}
