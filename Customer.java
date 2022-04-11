public class Customer implements CustomerInterface {
    private static int runningID = 0; //TODO: FIX
    private int id;
    private String type; // ["InRestaurant", "Takeaway", "Delivery"]
    private boolean isPaid;
    private double amountDue;
    private double waitTime; // In minutes
    private OrderInterface order;
    private boolean isServed;
    private Restaurant restaurant;

    public Customer(Restaurant restaurant, String type) {
        this.type = type;
        this.restaurant = restaurant;
        runningID++;
        id = runningID;
        amountDue = 0;
        order = new Order();
        isPaid = false;
        isServed = false;
    }

    @Override
    public void addToOrder(MenuItemInterface menu) {
        order.addMenuItem(menu);
    }

    @Override
    public OrderInterface placeOrder() {
        amountDue = order.getTotalPrice();
        if (!type.equalsIgnoreCase("InRestaurant")) {
            makePayment();
        }
        return order;
    }

    @Override
    public void makePayment() {
        // TODO: Apply discount first
        restaurant.updatePaymentList();
        restaurant.takePayment(amountDue);
        isPaid = true;
    }

    @Override
    public void getFood() {
        restaurant.updateCustomerList();
        isServed = true;
    }

    @Override
    public boolean getPayStatus(){
        return isPaid;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public double getWaitTime() {
        return waitTime;
    }
}
