import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Person {
    int age;

    Person(int age) {
        this.age = age;
    }
}

public class Test {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // Double num = input.nextDouble();
        // String word = input.next();
        // int myInt = input.nextInt();
        // System.out.println("You eneterd: " + num);
        // System.out.println("You eneterd: " + word);
        // System.out.println("You eneterd: " + myInt);

        // input.close();

        // ascending
        Integer[] myarr = { 5, 6, -9, 16, 0 };
        System.out.println("Original Array: " + Arrays.toString(myarr));
        Arrays.sort(myarr);
        System.out.println("Ascending: " + Arrays.toString(myarr));

        // descending method
        Arrays.sort(myarr, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(myarr));

    }
}