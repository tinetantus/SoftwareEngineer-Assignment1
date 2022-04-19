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
