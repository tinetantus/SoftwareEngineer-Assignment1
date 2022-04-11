import java.util.List;

public interface RestaurantInterface {
    public String getRestuarantName();
    public List<CustomerInterface> getCustomerList();
    public double getIncome();
    public List<CustomerInterface> getUnpaidList();
    public void  takePayment(double amount);
    public void addNewCustomer(CustomerInterface customer);
    public void updateCustomerList();
    public void updatePaymentList();
}
