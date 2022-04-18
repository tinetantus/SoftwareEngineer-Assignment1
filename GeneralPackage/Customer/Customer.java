package GeneralPackage.Customer;

import GeneralPackage.Restaurant.Products.MenuItemInterface;
import GeneralPackage.Restaurant.Products.Order;
import GeneralPackage.Restaurant.Products.OrderInterface;
import GeneralPackage.Restaurant.RestaurantInterface;

public abstract class Customer implements CustomerInterface {
    private int id;
    protected double amountDue;
    protected double waitTime; // In minutes
    protected OrderInterface order;
    private boolean isServed;
    private RestaurantInterface restaurant;

    public Customer(RestaurantInterface restaurant) {
        this.restaurant = restaurant;
        amountDue = 0;
        order = new Order();
        isServed = false;
        id = restaurant.getCustomerID();
    }

    @Override
    public void addToOrder(MenuItemInterface menu) {
        order.addMenuItem(menu);
        amountDue = order.getTotalPrice();
    }

    @Override
    public OrderInterface placeOrder() {
        restaurant.addNewCustomer(this);
        return order;
    }

    @Override
    public void makePayment() {
        for (DeliveryCustomer.PricingInterface discount : restaurant.getDiscountList())
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

    public RestaurantInterface getRestaurant() {
        return restaurant;
    }
}
