public class TotalCalculator implements TotalCalculate{
    
    private double price, quantity;
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public void calculateTotal() {
      double total = this.price * this.quantity;
      System.out.println("Order total: $" + total);
    }
}
