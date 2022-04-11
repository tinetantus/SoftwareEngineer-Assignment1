public class Customer implements CustomerInterface {
    private static int runningID = 0;
    private int id;
    private String type; //["In-Restaurant", "Takeaway", "Delivery"]
    private String address;
    private int tableId;
    private boolean isPaid;
    private double amountDue;
    private double waitTime; // In minutes
    private OrderInterface order;
    private boolean isServed;


    public Customer() {
        id = runningID++;
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
        if (!type.equals("In-Restaurant")) {
            makePayment();
        }
        return order;
    }

    @Override
    public void makePayment() {
        //TODO: Increment restaurant income account
        //TODO: Apply discount first
        isPaid = true;
    }

    public void getFood() {
        isServed = true;
    }
}
