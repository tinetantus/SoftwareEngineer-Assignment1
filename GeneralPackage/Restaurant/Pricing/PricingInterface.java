/**
 * Group Num: 28
 * Student Names: Dominic Verschoor i6267365, Tantus Choomphupan i6286789
 *
 */


package GeneralPackage.Restaurant.Pricing;
import GeneralPackage.Customer.*;

public interface PricingInterface {

    public double applyPricing(CustomerInterface customer);
    public String getFunction();
    public void setFunction(String name);
}
