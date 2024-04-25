  public class OrderTest1 {
    public static void main(String[] args) {
      Customer customer = new Customer();
      customer.setCustomerName("John Doe");
      customer.setAddress("123 Main St");
      customer.placeOrder();
      
      TotalCalculator tc = new TotalCalculator();
      tc.setPrice(10.0);
      tc.setQuantity(2);
      tc.calculateTotal();
    }
  }
  