/**
 * Group Num: 28
 * Student Names: Dominic Verschoor i6267365, Tantus Choomphupan i6286789
 *
 */


package GeneralPackage.Restaurant;
import GeneralPackage.Customer.*;
import GeneralPackage.Restaurant.Products.*;

import java.util.List;

public interface RestaurantInterface {
    public String getRestuarantName();
    public List<CustomerInterface> getCustomerList();
    public double getIncome();
    public List<CustomerInterface> getUnpaidList();
    public void  takePayment(double amount);
    public void addNewCustomer(CustomerInterface customer);
    public void updateCustomerList();
    public void updatePaymentList(CustomerInterface customer);
    public void addToUnpaidList(CustomerInterface customer);
    public List<DeliveryCustomer.PricingInterface> getDiscountList();
    public void addDiscountList(DeliveryCustomer.PricingInterface discount);
    public List<MenuItemInterface> getMenuItemList();
    public void addMenuItem(MenuItemInterface item);
    public int getCustomerID();
    public void createMenu(MenuItemInterface newItem);
    public void createPricing(DeliveryCustomer.PricingInterface newPricing);
}
