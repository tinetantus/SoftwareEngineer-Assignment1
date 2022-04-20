package GeneralPackage.Entry;

import java.util.List;

public interface EntryInterface {

    public List<String> getMenuList(); // Get the menu from the kitchen
    public void addToMenu(String name); // Adds items to customers orders through a string (name of dish)
    public void placeOrder(); // Customer finalizes their order and sends it to kitchen through this method

    public double getPaymentSummary(); // Returns the billing (including pricing)
    public void makePayment(double amount); // Customer makes payment that is sent to the ktichen
                                            //(this happens in placeOrder() or takeaway and delivery)
    public double getWaitTime(); //Retruns the waiting time for the dish (cooking + travel time)
    public void setDistance(double distance); // Distance is needed to determine travel time

}
