import java.util.Scanner;

public class DividebyZero {
    public static int quotient(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter an integer numerator ");
        int numerator = scanner.nextInt();
        System.out.println("please enter an integer denominator");
        int denominator = scanner.nextInt();
        int result = quotient(numerator, denominator);
        System.out.printf("%nResult:%d/%d=%d%n", numerator, denominator, result);

    }

}