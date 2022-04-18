package GeneralPackage.Restaurant.Pricing;
import GeneralPackage.Customer.*;

public class PercentPricing implements PricingInterface{

    private double discountPercent;
    private String name;

    // 1-100
    public PercentPricing(double discountPercent, String name) {
        this.discountPercent = Math.min(100,discountPercent)/100;
        this.name = name;
    }
    @Override
    public double applyPricing(CustomerInterface customer) {
        return customer.getAmountDue()*(1-discountPercent);
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
