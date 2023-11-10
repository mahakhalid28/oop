
public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        Taxi t1 = new Taxi(new Location(2, 3));
        Taxi t2 = new Taxi(new Location(5, 3));
        Passenger p1 = new Passenger(new Location(4, 3), "ali");

        m1.taxis.add(t1);
        m1.taxis.add(t2);
        System.out.println(m1.taxis);
        m1.sortByNearest(p1);
        System.out.println(m1.taxis);

    }
}
