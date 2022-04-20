/**
 * Software Engineer Assignment 2
 * Group 28
 * Student 1: Tantus Choomphupan i6286789
 * Student 2: Dominic Verschoor i6267365
 */

package GeneralPackage.Entry;

import GeneralPackage.Kitchen.KitchenInterface; // DEPENDANCY 1
import java.util.ArrayList;
import java.util.List;

public abstract class Entry implements EntryInterface {
    KitchenInterface kitchen;
    List<String> order;

    public Entry(KitchenInterface kitchen) {
        this.kitchen = kitchen;
        order = new ArrayList<>();
    }

    @Override
    public List<String> getMenuList() {
        for (String menu: kitchen.getMenuList())
            System.out.println(menu);
        return kitchen.getMenuList();
    }

    @Override
    public void addToMenu(String name) {
        if (kitchen.getMenuList().contains(name))
            order.add(name);
        System.out.println("This menu does not exist");
    }

    @Override
    public void placeOrder() {
        // I: Delivery -> (placeOrder + getPaymentSummary + makePayment): WaitTime = CookTime + DeliveryTime
        // II: Takeaway -> (placeOrder + getPaymentSummary + makePayment): WaitTime = CookTime
        // III: In Restaurant -> placeOrder + (getPaymentSummary + makePayment): WaitTime = CookTime
        kitchen.placeOrder(order);
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
    public double getWaitTime() {
        return kitchen.getWaitTime();
    }

    @Override
    public void setDistance(double distance) {
        distance = 0;
    }
}
