public interface CustomerInterface {
    public void addToOrder(MenuItemInterface menu);
    public OrderInterface placeOrder();
    public void makePayment();
    public int getID();
    public void getFood();
    public boolean getPayStatus();
    public double getWaitTime();
}
