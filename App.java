import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<IngredientInterface> beckyStuff = new ArrayList<>();
        beckyStuff.add(new Ingredient(1.25, "egg"));
        beckyStuff.add(new Ingredient(2.5, "chicken"));
        beckyStuff.add(new Ingredient(4.0, "pork"));
        beckyStuff.add(new Ingredient(0.75, "coke"));
        beckyStuff.add(new Ingredient(0.75, "fanta"));
        beckyStuff.add(new Ingredient(3.25, "rice"));

        Restaurant becky = new Restaurant("Becky", beckyStuff);

        becky.createMenu(new MenuItem("Coke lol", beckyStuff.subList(3, 4), 0.5, MenuItem.ItemType.DRINK));
        becky.createMenu(new MenuItem("Parent Child Combo", beckyStuff.subList(0, 1), 20, MenuItem.ItemType.DESSERT));
        becky.createMenu(new MenuItem("Yummy Soup", beckyStuff.subList(4, 5), 15, MenuItem.ItemType.SIDE));
        becky.createMenu(new MenuItem("WomboCombo", beckyStuff, 50, MenuItem.ItemType.MAIN));

        becky.createPricing(new BuyXGetYPricing(becky.getMenuItemList().get(3), 1, becky.getMenuItemList().get(0), 1));
        becky.createPricing(new PercentPricing(10.0,"10% universal discount"));

        DeliveryEntry deliveryWeb = new DeliveryEntry(becky);
        InRestaurantEntry inResWeb = new InRestaurantEntry(becky);
        TakeAwayEntry takeAwayWeb = new TakeAwayEntry(becky);

        deliveryWeb.setDistance(10);
        deliveryWeb.createNewCustomer();
        inResWeb.createNewCustomer();
        takeAwayWeb.createNewCustomer();

        deliveryWeb.addToOrder(becky.getMenuItemList().get(3));
        deliveryWeb.addToOrder(becky.getMenuItemList().get(0));
        deliveryWeb.addToOrder(becky.getMenuItemList().get(1));

        inResWeb.addToOrder(becky.getMenuItemList().get(0));
        inResWeb.addToOrder(becky.getMenuItemList().get(0));
        inResWeb.addToOrder(becky.getMenuItemList().get(0));

        takeAwayWeb.addToOrder(becky.getMenuItemList().get(2));
        takeAwayWeb.addToOrder(becky.getMenuItemList().get(0));
        takeAwayWeb.addToOrder(becky.getMenuItemList().get(3));

        deliveryWeb.placeOrder();
        takeAwayWeb.placeOrder();
        inResWeb.placeOrder();

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
