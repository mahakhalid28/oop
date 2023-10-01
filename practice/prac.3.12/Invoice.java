public class Invoice {
    private String partNum;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String partNum, String description, int quantity, double price) {
        this.partNum = partNum;
        this.description = description;
        this.quantity = quantity;
        this.price = price;

    }

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public String getPartNum() {
        return partNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInvoiceAmount() {
        if (quantity < 0) {
            return 0;
        }
        if (price < 0) {
            return 0;
        }
        return quantity * price;

    }

    public String toString() {
        return String.format("%s %s %d %f", partNum, description, quantity, price);
    }

}
