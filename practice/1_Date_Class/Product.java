
public class Product {

    private int id;
    private static int counter = 0;
    private String name;
    private double price;
    private int quantity;
    private Date manfDate;

    Product(String name, double price, int quantity, Date manfDate) {
        Product.counter += 1;
        this.id = counter;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manfDate = manfDate;
    }

    public String toString() {
        String details = String.format("Id: %d Name: %s Price: %.2f Quantity: %d", id, name, price, quantity);
        return details;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setManfDate(Date manfDate) {
        this.manfDate = manfDate;
    }

    public Date getManfDate() {
        return manfDate;
    }

    public static Product recentProduct(Product p1, Product p2) {
        return p1.manfDate.gt(p2.manfDate) ? p1 : p2;
        // if (p1.manfDate.gt(p2.manfDate)) {
        // return p1;
        // } else {
        // return p2;
        // }
    }
}
