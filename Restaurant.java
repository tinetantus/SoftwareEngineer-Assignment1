import java.util.ArrayList;
import java.util.List;

public class Restaurant implements RestaurantInterface{
    private String name;
    private double income;
    private List<CustomerInterface> customerList;
    private List<CustomerInterface> unpaidList;
    private List<MenuItemInterface> menuList;
    private List<PricingInterface> discountList;
    private int customerID;

    public Restaurant(String name, List<IngredientInterface> ingredientList){
        menuList = new ArrayList<>();
        customerID = 0;
        customerList = new ArrayList<CustomerInterface>();
        unpaidList = new ArrayList<CustomerInterface>();
        income = 0;
        this.name = name;
        discountList = new ArrayList<>();
    }

    @Override
    public void createMenu(MenuItemInterface newItem){
        menuList.add(newItem);
    }

    @Override
    public void createPricing(PricingInterface newPricing) {
        discountList.add(newPricing);
    }

    @Override
    public void addNewCustomer(CustomerInterface customer) {
        customerList.add(customer);
    }
    @Override
    public void addToUnpaidList(CustomerInterface customer) {
        unpaidList.add(customer);
    }

    @Override
    public String getRestuarantName() {
        return name;
    }

    @Override
    public List<CustomerInterface> getCustomerList() {
        return customerList;
    }

    @Override
    public double getIncome() {
        return income;
    }

    @Override
    public void takePayment(double amount){
        income += amount;
    }

    @Override
    public List<CustomerInterface> getUnpaidList() {
        return unpaidList;
    }

    @Override
    public void updateCustomerList() {
        customerList.remove(0);
    }

    @Override
    public void updatePaymentList(CustomerInterface customer) {
        unpaidList.remove(customer);
    }

    @Override
    public List<PricingInterface> getDiscountList() {
        return discountList;
    }

    @Override
    public void addDiscountList(PricingInterface discount) {
        discountList.add(discount);
    }

    @Override
    public List<MenuItemInterface> getMenuItemList() {
        return menuList;
    }

    @Override
    public int getCustomerID(){
        return  ++customerID;
    }

    @Override
    public void addMenuItem(MenuItemInterface item){
        menuList.add(item);
    }
}
