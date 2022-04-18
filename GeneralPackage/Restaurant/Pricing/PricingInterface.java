package GeneralPackage.Restaurant.Pricing;
import GeneralPackage.Customer.*;

public interface PricingInterface {

    public double applyPricing(CustomerInterface customer);
    public String getFunction();
    public void setFunction(String name);
}
