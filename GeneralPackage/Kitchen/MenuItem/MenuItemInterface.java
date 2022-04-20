package GeneralPackage.Kitchen.MenuItem;

public interface MenuItemInterface {

    public double getPrepTime(); // Returns the time to prepare dish

    public double getMenuPrice(); // Returns the price of the dish

    public String getItemName(); // Retruns name of dish

    public String getType(); // Returns the type of dish (main, side, dessert, drink)
}
