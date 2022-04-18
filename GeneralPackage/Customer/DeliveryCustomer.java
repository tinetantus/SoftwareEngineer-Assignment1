/**
 * Group Num: 28
 * Student Names: Dominic Verschoor i6267365, Tantus Choomphupan i6286789
 *
 */


package GeneralPackage.Customer;

import GeneralPackage.Restaurant.Products.MenuItemInterface;
import GeneralPackage.Restaurant.Products.OrderInterface;
import GeneralPackage.Restaurant.RestaurantInterface;

public class DeliveryCustomer extends Customer{
    private double distanceInKM;
    private static final double SPEED = 5;

    public DeliveryCustomer(RestaurantInterface restaurant, double distanceInKM) {
        super(restaurant);
        this.distanceInKM = distanceInKM;
    }

    @Override
    public OrderInterface placeOrder() {
        waitTime = order.getCookTime() + (distanceInKM*SPEED);
        makePayment();
        return super.placeOrder();
    }

    public static class BuyXGetYPricing implements PricingInterface {
        private MenuItemInterface buyItem;
        private int amountOfBuyItem;
        private MenuItemInterface getItem;
        private int amountOfGetItem;

        private String name;

        public BuyXGetYPricing(MenuItemInterface buyItem, int amountOfBuyItem, MenuItemInterface getItem, int amountOfGetItem) {
            this.buyItem = buyItem;
            this.amountOfBuyItem = amountOfBuyItem;
            this.getItem = getItem;
            this.amountOfGetItem = amountOfGetItem;
        }

        @Override
        public double applyPricing(CustomerInterface customer) {

            int counter = 0;
            for (MenuItemInterface menu : customer.getOrder().getMenuList()) {
                if (menu.equals(buyItem))
                    counter++;
            }

            if (counter >= amountOfBuyItem)
                return customer.getAmountDue() - (getItem.getMenuPrice() * amountOfGetItem);

            return customer.getAmountDue();
        }

        @Override
        public String getFunction() {
            return name;
        }

        @Override
        public void setFunction(String name) {
            this.name = name;
        }
    }

    public static class PercentPricing implements PricingInterface{

        private double discountPercent;
        private String name;

        // 1-100
        public PercentPricing(double discountPercent, String name) {
            this.discountPercent = Math.min(100,discountPercent)/100;
            this.name = name;
        }
        @Override
        public double applyPricing(CustomerInterface customer) {
            return customer.getAmountDue()*(1-discountPercent);
        }

        @Override
        public String getFunction() {
            return name;
        }

        @Override
        public void setFunction(String name) {
            this.name = name;
        }
    }

    public static interface PricingInterface {

        public double applyPricing(CustomerInterface customer);
        public String getFunction();
        public void setFunction(String name);
    }
}
