public interface CustomerInterface {
    public void addToOrder(MenuItemInterface menu);
    public OrderInterface placeOrder();
    public void makePayment();
    public int getID();
    public void getFood();
    public double getWaitTime();

    public double getAmountDue();

    public OrderInterface getOrder();

    public boolean isServed();

    public RestaurantInterface getRestaurant();


}
