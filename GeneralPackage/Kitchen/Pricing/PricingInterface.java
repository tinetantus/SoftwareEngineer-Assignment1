package GeneralPackage.Kitchen.Pricing;

import GeneralPackage.Kitchen.KitchenInterface;

public interface PricingInterface {
    public double applyPricing(KitchenInterface kitchen);
    public String getFunction();
    public void setFunction(String name);
}
