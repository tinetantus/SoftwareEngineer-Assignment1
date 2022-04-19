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

    public static void deliverySequence(KitchenInterface kitchen) {
        Entry entry = new EntryDelivery(kitchen);

        entry.getMenuList();

        entry.addToMenu("Item1");
        entry.addToMenu("Item2");

        entry.setDistance(10);

        entry.placeOrder();

        entry.getWaitTime();
    }

    public static void takeawaySequence(KitchenInterface kitchen) {
        Entry entry = new EntryTakeaway(kitchen);

        entry.getMenuList();

        entry.addToMenu("Item1");
        entry.addToMenu("Item2");

        entry.placeOrder();

        entry.getWaitTime();
    }

    public static void inRestuarantSequence(KitchenInterface kitchen) {
        Entry entry = new EntryInRestuarant(kitchen);

        entry.getMenuList();

        entry.addToMenu("Item1");
        entry.addToMenu("Item2");

        entry.placeOrder();

        double amountDue = entry.getPaymentSummary();
        entry.makePayment(amountDue);

        entry.getWaitTime();
    }

    public static void inResWaiterSequence(KitchenInterface kitchen) {

        WaiterInterface waiter = new Waiter(kitchen);

        waiter.addToMenu("Item2");
        waiter.addToMenu("Item3");
        waiter.addToMenu("Item1");

        waiter.placeOrder();

        double amountDue = waiter.getPaymentSummary();
        waiter.makePayment(amountDue);
    }
}
