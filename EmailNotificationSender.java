public class EmailNotificationSender implements EmailNotificationSend{
   
    private String email;
   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void sendEmailNotification() {
      // Simulate sending email notification
      System.out.println("Email notification sent to: " + this.email);
    }
}
