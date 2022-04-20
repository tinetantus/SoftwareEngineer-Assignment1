/**
 * Software Engineer Assignment 2
 * Group 28
 * Student 1: Tantus Choomphupan i6286789
 * Student 2: Dominic Verschoor i6267365
 */

package GeneralPackage.Entry;

import GeneralPackage.Kitchen.KitchenInterface;

public class EntryDelivery extends Entry{
    public EntryDelivery(KitchenInterface kitchen) {
        super(kitchen);
    }

    public void setDistance(double distance) {
        kitchen.setDistance(distance);
    }

    @Override
    public double getWaitTime() {
        return kitchen.getWaitTime() + kitchen.getDriveTime();
    }

    @Override
    public void placeOrder() {
        super.placeOrder();
        double amountDue = getPaymentSummary();
        makePayment(amountDue);
    }
}
