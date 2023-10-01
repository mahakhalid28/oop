public class Invoicetest {
    public static void main(String[] args) {
        Invoice amount = new Invoice("matr", " halal", 45, 88.0);
        amount.setQuantity(-40);
        System.out.println(amount);

        System.out.println(amount.getInvoiceAmount());
    }

}
