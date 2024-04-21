public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerAddress;
    public Customer() {
    }
    public void setCustomerId(int customerId) {
            this.customerId = Math.abs(customerId);
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    public int getCustomerId() {
        return customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }
}
