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

        ArrayList<IngredientInterface> timStuff = new ArrayList<>();
        timStuff.add(new Ingredient(2.25, "big egg"));
        timStuff.add(new Ingredient(4.5, "big chicken"));
        timStuff.add(new Ingredient(8.0, "big pork"));
        timStuff.add(new Ingredient(1.25, "big coke"));
        timStuff.add(new Ingredient(1.25, "big fanta"));
        timStuff.add(new Ingredient(6.25, "big rice"));

        ArrayList<MenuItemInterface> beckyMenu = new ArrayList<>();
        beckyMenu.add(new MenuItem("WomboCombo", beckyStuff, 50));
        beckyMenu.add(new MenuItem("Coke lol", beckyStuff.subList(3, 3), 0.5));
        beckyMenu.add(new MenuItem("Parent Child Combo", beckyStuff.subList(0, 1), 20));
        beckyMenu.add(new MenuItem("Yummy Soup", beckyStuff.subList(4, 5), 15));

        ArrayList<MenuItemInterface> timMenu = new ArrayList<>();
        timMenu.add(new MenuItem("Big WomboCombo", timStuff, 50));
        timMenu.add(new MenuItem("Big Coke lol", timStuff.subList(3, 3), 0.5));
        timMenu.add(new MenuItem("Big Parent Child Combo", timStuff.subList(0, 1), 20));
        timMenu.add(new MenuItem("Big Yummy Soup", timStuff.subList(4, 5), 15));
        

        Restaurant becky = new Restaurant("Becky", beckyStuff);
        Restaurant tim = new Restaurant("Tim", timStuff);

        Customer customer1 = new Customer(becky, "InRestaurant");
        Customer customer2 = new Customer(becky, "takeaway");
        Customer customer3 = new Customer(becky, "Delivery");

        Customer customer4 = new Customer(tim, "Delivery");
        Customer customer5 = new Customer(tim, "takeaway");
        Customer customer6 = new Customer(tim, "InRestaurant");

        becky.addNewCustomer(customer1);
        becky.addNewCustomer(customer2);
        becky.addNewCustomer(customer3);

        tim.addNewCustomer(customer4);
        tim.addNewCustomer(customer5);
        tim.addNewCustomer(customer6);

        customer1.addToOrder(beckyMenu.get(0));
        customer1.addToOrder(beckyMenu.get(3));
        customer2.addToOrder(beckyMenu.get(1));
        customer3.addToOrder(beckyMenu.get(2));

        customer4.addToOrder(timMenu.get(0));
        customer5.addToOrder(timMenu.get(1));
        customer6.addToOrder(timMenu.get(2));

        customer1.placeOrder();
        customer2.placeOrder();

        customer4.placeOrder();
        customer6.placeOrder();

        printInfo(becky);
        printInfo(tim);
    }

    public static void printInfo(Restaurant restaurant){
        System.out.println(restaurant.getRestuarantName() + " income: " + restaurant.getIncome());
        System.out.println();

        for (int i = 0; i < restaurant.getCustomerList().size(); i++) {
            System.out.println(restaurant.getRestuarantName() + " customer " +restaurant.getCustomerList().get(i).getID());
        }

        System.out.println();
        for (int i = 0; i < restaurant.getUnpaidList().size(); i++) {
            System.out.println(restaurant.getRestuarantName() + " unpaid " +restaurant.getCustomerList().get(i).getID());
        }
        System.out.println("___________________________________");
    }
}
