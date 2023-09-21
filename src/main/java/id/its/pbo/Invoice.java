package id.its.pbo;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    // konstruktor 
    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity); 
        setPrice(price); 
    }

   //setter - getter part number
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    
    public String getPartNumber() {
        return partNumber;
    }

    // setter - getter part desc
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

   
    public String getPartDescription() {
        return partDescription;
    }

   // setter - getter quantity
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0 ;
        } else {
            this.quantity = quantity;
        }
    }

   
    public int getQuantity() {
        return quantity;
    }

    //setter getter price
    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price ;
        }
    }

    
    public double getPrice() {
        return price;
    }

   // hitung invoice
    public double getInvoiceAmount() {
        return quantity * price;
    }
}
 
//program
	class InvoiceProgram {
    public static void main(String[] args) {
        
    	//create 2 objects
        Invoice invoice1 = new Invoice("12345", "Pensil", 7, 10.25);
        Invoice invoice2 = new Invoice("54321", "Penghapus", -1, -5.25);
        
        double invoiceAmount1 = invoice1.getInvoiceAmount();
        double invoiceAmount2 = invoice2.getInvoiceAmount();
        
        System.out.println("Invoice 1 Amount: " + invoiceAmount1);
        System.out.println("Invoice 2 Amount: " + invoiceAmount2);

    

}
}
