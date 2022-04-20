package GeneralPackage.Customer;

import GeneralPackage.Entry.Entry;
import GeneralPackage.Entry.EntryDelivery;
import GeneralPackage.Entry.EntryInRestuarant;
import GeneralPackage.Entry.EntryTakeaway;
import GeneralPackage.Kitchen.Ingredient.Ingredient;
import GeneralPackage.Kitchen.Ingredient.IngredientInterface;
import GeneralPackage.Kitchen.Kitchen;
import GeneralPackage.Kitchen.KitchenInterface;
import GeneralPackage.Kitchen.MenuItem.MenuItem;
import GeneralPackage.Kitchen.MenuItem.MenuItemInterface;
import GeneralPackage.Kitchen.Pricing.PercentPricing;
import GeneralPackage.Kitchen.Pricing.PricingInterface;
import GeneralPackage.Waiter.Waiter;
import GeneralPackage.Waiter.WaiterInterface;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<MenuItemInterface> menuList = new ArrayList<>();
        List<PricingInterface> pricingList = new ArrayList<>();
        List<IngredientInterface> ingredientList = new ArrayList<>();

        ingredientList.add(new Ingredient(1.25, "Ing1"));
        ingredientList.add(new Ingredient(2.5, "Ing2"));

        menuList.add(new MenuItem("Item1", ingredientList.subList(0, 0), 0.5, MenuItem.ItemType.DRINK));
        menuList.add(new MenuItem("Item2", ingredientList.subList(0, 1), 5, MenuItem.ItemType.DESSERT));
        menuList.add(new MenuItem("Item3", ingredientList.subList(1, 1), 2.75, MenuItem.ItemType.MAIN));

        pricingList.add(new PercentPricing(10,"10% Off universal discount"));

        KitchenInterface kitchen = new Kitchen(menuList, pricingList);

        deliverySequence(kitchen);

    }

    //delivery scenario
    public static void deliverySequence(KitchenInterface kitchen) {
        //Enters online website
        Entry entry = new EntryDelivery(kitchen);

        //Entry sends the menu to the customer
        entry.getMenuList();

        //add items to the order through entry
        entry.addToMenu("Item1");
        entry.addToMenu("Item2");

        //input the distance (address) through entry
        entry.setDistance(10);

        //Place order through entry (this calls the paying method as well)
        entry.placeOrder();

        //Entry sends the wait time to the customer
        entry.getWaitTime();
    }

    //Take away scenario
    public static void takeawaySequence(KitchenInterface kitchen) {
        //Enters online website
        Entry entry = new EntryTakeaway(kitchen);

        //Entry sends the menu to the customer
        entry.getMenuList();

        //add items to the order through entry
        entry.addToMenu("Item1");
        entry.addToMenu("Item2");

        //Place order through entry (this calls the paying method as well)
        entry.placeOrder();

        //Entry sends the wait time to the customer
        entry.getWaitTime();
    }

    //In Restaurant scenario
    public static void inRestuarantSequence(KitchenInterface kitchen) {
        //Enter site through QR (from in the restaurant
        Entry entry = new EntryInRestuarant(kitchen);

        //Entry sends the menu to the customer
        entry.getMenuList();

        //add items to the order through entry
        entry.addToMenu("Item1");
        entry.addToMenu("Item2");

        //Place order through entry
        entry.placeOrder();
        //Entry sends the wait time to the customer
        entry.getWaitTime();

        //Customer gets a payment summary (when asked for)
        double amountDue = entry.getPaymentSummary();
        //Customer pays through the site (when wanted to)
        entry.makePayment(amountDue);

    }

    //Waiter scenario
    public static void inResWaiterSequence(KitchenInterface kitchen) {
        //Ordering through waiter physically
        WaiterInterface waiter = new Waiter(kitchen);

        //Waiter adds items to order
        waiter.addToMenu("Item2");
        waiter.addToMenu("Item3");
        waiter.addToMenu("Item1");

        // waiter places the order
        waiter.placeOrder();

        // get a payment summary from the waiter
        double amountDue = waiter.getPaymentSummary();
        //pay the waiter
        waiter.makePayment(amountDue);
    }
}
