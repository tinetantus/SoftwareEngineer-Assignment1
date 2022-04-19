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
