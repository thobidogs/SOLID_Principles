public class OrderTest2 {
        public static void main(String[] args) {
          
            Customer customer = new Customer();
            customer.setCustomerName("John Doe");
            customer.setAddress("123 Main St");
            customer.placeOrder();
            
            TotalCalculator tc = new TotalCalculator();
            tc.setPrice(10.0);
            tc.setQuantity(2);
            tc.calculateTotal();
            
            InvoiceGenerator invoice = new InvoiceGenerator();
            invoice.setFilename("order_123.pdf");
            invoice.generateInvoice();
            
            EmailNotificationSender notif = new EmailNotificationSender();
            notif.setEmail("johndoe@example.com");
            notif.sendEmailNotification();
        }
      }
