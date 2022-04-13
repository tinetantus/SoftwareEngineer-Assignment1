import java.util.ArrayList;
import java.util.List;

public class Restaurant implements RestaurantInterface{
    private String name;
    private double income;
    private List<CustomerInterface> customerList;
    private List<CustomerInterface> unpaidList;

    private List<PricingInterface> discountList;

    public Restaurant(String name, List<IngredientInterface> ingredientList){
        customerList = new ArrayList<CustomerInterface>();
        unpaidList = new ArrayList<CustomerInterface>();
        income = 0;
        this.name = name;
        discountList = new ArrayList<>();
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

    public List<PricingInterface> getDiscountList() {
        return discountList;
    }

    public void addDiscountList(PricingInterface discount) {
        discountList.add(discount);
    }
}
