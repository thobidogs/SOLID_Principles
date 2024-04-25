public class InvoiceGenerator implements InvoiceGenerate {
    
    public String fileName;
    
    public String getFilename() {
        return fileName;
    }

    public void setFilename(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void generateInvoice() {
      // Simulate generating invoice file
      System.out.println("Invoice generated: " + this.fileName);
    }
}
