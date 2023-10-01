public class Testclass {
    public static void main(String args[]) {
        Product p1 = new Product("pen ", 10.0, 6, new Date(4, 9, 2023));
        Product p2 = new Product("ink", 2, 10, new Date(4, 10, 2023));
        System.out.println(Product.recentProduct(p1, p2));

    }
}
