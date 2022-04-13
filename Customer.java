public abstract class Customer implements CustomerInterface {
    private static int runningID = 0; //TODO: FIX
    private int id;
    protected double amountDue;
    protected double waitTime; // In minutes
    protected OrderInterface order;
    private boolean isServed;
    private Restaurant restaurant;

    public Customer(Restaurant restaurant) {
        this.restaurant = restaurant;
        runningID++;
        id = runningID;
        amountDue = 0;
        order = new Order();
        isServed = false;
    }

    @Override
    public void addToOrder(MenuItemInterface menu) {
        order.addMenuItem(menu);
    }

    @Override
    public OrderInterface placeOrder() {
        amountDue = order.getTotalPrice();
        restaurant.addNewCustomer(this);
        return order;
    }

    @Override
    public void makePayment() {
        for (PricingInterface discount : restaurant.getDiscountList())
            amountDue = discount.applyPricing(this);

        restaurant.updatePaymentList(this);
        restaurant.takePayment(amountDue);
    }

    @Override
    public void getFood() {
        restaurant.updateCustomerList();
        isServed = true;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public double getWaitTime() {
        return waitTime;
    }

    @Override
    public double getAmountDue() {
        return amountDue;
    }

    public int getId() {
        return id;
    }

    @Override
    public OrderInterface getOrder() {
        return order;
    }

    public boolean isServed() {
        return isServed;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }
}
