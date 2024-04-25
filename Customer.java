public class Customer implements OrderPlace{

    private String customerName, address;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void placeOrder() {
      // Simulate placing order in a system
      System.out.println("Order placed for " + this.customerName + " at " + this.address);
    }
}
