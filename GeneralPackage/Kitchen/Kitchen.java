package GeneralPackage.Kitchen;

import GeneralPackage.Kitchen.MenuItem.MenuItemInterface;
import GeneralPackage.Kitchen.Pricing.PricingInterface;
import GeneralPackage.Waiter.WaiterInterface;

import java.util.ArrayList;
import java.util.List;

public class Kitchen implements KitchenInterface {

    List<MenuItemInterface> menuList;
    List<PricingInterface> pricingList;
    List<MenuItemInterface> customerOrder;
    private double amountDue;
    private double bankAccount;
    private double distance;

    public Kitchen(List<MenuItemInterface> menuList, List<PricingInterface> pricingList) {
        this.menuList = menuList;
        this.pricingList = pricingList;
        bankAccount = 0;
        amountDue = 0;
        distance = 0;
    }


    @Override
    public List<String> getMenuList() {
        List<String> stringList = new ArrayList<>();

        for (MenuItemInterface item : menuList)
            stringList.add(item.getItemName());

        return stringList;
    }

    @Override
    public double getAmountDue() {
        return amountDue;
    }

    @Override
    public double getPriceSummary() {
        amountDue = 0;
        for (MenuItemInterface item : customerOrder) {
            amountDue += item.getMenuPrice();
        }

        for (PricingInterface pricing : pricingList) {
            amountDue = pricing.applyPricing(this);
        }
        return amountDue;
    }

    @Override
    public double getWaitTime() {
        double waitTime = 0;
        for (MenuItemInterface item : customerOrder)
            waitTime += item.getPrepTime();

        return waitTime;
    }

    @Override
    public void placeOrder(List<String> order) {
        for (String item : order) {
            for (MenuItemInterface menuInList : menuList) {
                if (item.equals(menuInList.getItemName())) {
                    customerOrder.add(menuInList);
                }
            }
        }
    }

    @Override
    public void makePayment(double amount) {
        bankAccount += amount;
    }

    @Override
    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public void deliverFood() {
        WaiterInterface availWaiter = WaiterInterface.getAvailableDriver();
        availWaiter.deliverFood(distance);
    }

    @Override
    public double getDriveTime() {
        WaiterInterface availWaiter = WaiterInterface.getAvailableDriver();
        return availWaiter.approxDriveTime(distance);
    }
}
