package GeneralPackage;

import GeneralPackage.Customer.*;
import GeneralPackage.Customer.Entry.*;
import GeneralPackage.Restaurant.Products.*;
import GeneralPackage.Restaurant.*;

import java.util.ArrayList;

public class AppSimplified {
    public static void main(String[] args) {
        ArrayList<IngredientInterface> beckyStuff = new ArrayList<>();
        beckyStuff.add(new Ingredient(10.25, "egg"));

        Restaurant becky = new Restaurant("Becky", beckyStuff);
        becky.createMenu(new MenuItem("Coke lol", beckyStuff, 0.5, MenuItem.ItemType.DRINK));

        becky.createPricing(new DeliveryCustomer.BuyXGetYPricing(becky.getMenuItemList().get(0), 1, becky.getMenuItemList().get(0), 1));

        DeliveryEntry delWeb = new DeliveryEntry(becky);

        delWeb.createNewCustomer();

        delWeb.addToOrder(becky.getMenuItemList().get(0));

        delWeb.placeOrder();

        printInfo(becky);
    }

    public static void printInfo(Restaurant restaurant) {
        System.out.println(restaurant.getRestuarantName() + " income: " + restaurant.getIncome());
        System.out.println();

        for (int i = 0; i < restaurant.getCustomerList().size(); i++) {
            System.out.println(restaurant.getRestuarantName() + " customer " + restaurant.getCustomerList().get(i).getID());
        }

        System.out.println();
        for (int i = 0; i < restaurant.getUnpaidList().size(); i++) {
            System.out.println(restaurant.getRestuarantName() + " unpaid " + restaurant.getCustomerList().get(i).getID());
        }
        System.out.println("___________________________________");
    }
}
