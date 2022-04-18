/**
 * Group Num: 28
 * Student Names: Dominic Verschoor i6267365, Tantus Choomphupan i6286789
 *
 */


package GeneralPackage.Restaurant.Pricing;
import GeneralPackage.Customer.*;
import GeneralPackage.Restaurant.Products.*;

public class BuyXGetYPricing implements PricingInterface {
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
