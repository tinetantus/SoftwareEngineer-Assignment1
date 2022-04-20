/**
 * Software Engineer Assignment 2
 * Group 28
 * Student 1: Tantus Choomphupan i6286789
 * Student 2: Dominic Verschoor i6267365
 */

package GeneralPackage.Entry;

import GeneralPackage.Kitchen.KitchenInterface;

public class EntryTakeaway extends Entry{
    public EntryTakeaway(KitchenInterface kitchen) {
        super(kitchen);
    }

    @Override
    public void placeOrder() {
        super.placeOrder();
        double amountDue = getPaymentSummary();
        makePayment(amountDue);
    }
}
