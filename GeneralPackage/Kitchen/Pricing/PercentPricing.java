package GeneralPackage.Kitchen.Pricing;

import GeneralPackage.Kitchen.KitchenInterface;

public class PercentPricing implements PricingInterface{

    private double discountPercent;
    private String name;

    // 1-100
    public PercentPricing(double discountPercent, String name) {
        this.discountPercent = Math.min(100, discountPercent) / 100;
        this.name = name;
    }

    @Override
    public double applyPricing(KitchenInterface kitchen) {
        return kitchen.getAmountDue() * (1-discountPercent);
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