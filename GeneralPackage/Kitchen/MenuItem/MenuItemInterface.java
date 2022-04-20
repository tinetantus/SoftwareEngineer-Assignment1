/**
 * Software Engineer Assignment 2
 * Group 28
 * Student 1: Tantus Choomphupan i6286789
 * Student 2: Dominic Verschoor i6267365
 */

package GeneralPackage.Kitchen.MenuItem;

public interface MenuItemInterface {
    /**
     * Get preparation time of the menu
     * @return preperation time in minutes
     */
    public double getPrepTime();

    /**
     * Get the price of this menu calculated by combine price of each ingredient contain in the menu
     * @return price of the menu
     */
    public double getMenuPrice();

    /**
     * Get name of the menu
     * @return name of the menu
     */
    public String getItemName();

    /**
     * Get the type of the menu [MAIN, SIDE, DRINK, DESSERT]
     * @return type of the menu
     */
    public String getType();
}
