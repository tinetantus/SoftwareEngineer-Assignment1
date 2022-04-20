/**
 * Software Engineer Assignment 2
 * Group 28
 * Student 1: Tantus Choomphupan i6286789
 * Student 2: Dominic Verschoor i6267365
 */

package GeneralPackage.Kitchen.Pricing;

import GeneralPackage.Kitchen.KitchenInterface;

public interface PricingInterface {
    /**
     * Apply pricing strategy to the amount due
     * @param kitchen kitchen instance that contain the customer order and amount due
     * @return new due amount adjusted for pricing strategy
     */
    public double applyPricing(KitchenInterface kitchen);

    /**
     * Get the name of the pricing strategy
     * @return name of the strategy
     */
    public String getFunction();

    /**
     * Set the name of the pricing strategy
     * @param name name of the strategy
     */
    public void setFunction(String name);
}
