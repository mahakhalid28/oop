package lab_3;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Music m1 = new Music("pal", new Artist("atif", "pakistani", 8), "threeMins", "sad", "sun",
                new Date(6, 8, 2023));
        Music m2 = new Music("A", new Artist("atifa", "pakistani", 8), "threeMins", "sad", "sun",
                new Date(7, 8, 2023));
        Music m3 = new Music("B", new Artist("atif", "pakistani", 8), "threeMins", "sad", "sun",
                new Date(6, 8, 2023));
        Music m4 = new Music("C", new Artist("atifc", "pakistani", 8), "threeMins", "sad", "sun",
                new Date(8, 8, 2023));
        Music m5 = new Music("D", new Artist("atif", "pakistani", 8), "threeMins", "sad", "sun",
                new Date(9, 8, 2023));

        System.out.println(m1.equals(m3));
        Music list[] = new Music[5];
        list[0] = m1;
        list[1] = m2;
        list[2] = m3;
        list[3] = m4;
        list[4] = m5;
        for (int m = 0; m < list.length; m++) {
            System.out.println(list[m].toString());

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter m1 details");

        String title = sc.nextLine();
        String name = sc.nextLine();
        String nationality = sc.nextLine();
        String rating = sc.nextLine();

        String duration = sc.nextLine();

        String genre = sc.nextLine();

    }

}
