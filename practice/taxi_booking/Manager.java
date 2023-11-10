import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager {
    ArrayList<Taxi> taxis = new ArrayList<Taxi>();

    public void sortByNearest(Passenger p) {

        // SORTING USING ANONYMOUS INNER CLASS
        // Collections.sort(taxis, new Comparator<Taxi>() {
        // @Override
        // public int compare(Taxi t1, Taxi t2) {
        // double t1Distance = Location.getDistance(p.getLocation(), t1.getLocation());
        // double t2Distance = Location.getDistance(p.getLocation(), t2.getLocation());
        // if (t1Distance > t2Distance) {
        // return 1;
        // } else if (t1Distance < t2Distance) {
        // return -1;
        // } else {
        // return 0;
        // }
        // }
        // });

        // SORTING USING LAMBDA FUNCTIONS
        // Collections.sort(taxis, (Taxi t1, Taxi t2) -> {
        // double t1Distance = Location.getDistance(p.getLocation(), t1.getLocation());
        // double t2Distance = Location.getDistance(p.getLocation(), t2.getLocation());
        // if (t1Distance > t2Distance) {
        // return 1;
        // } else if (t1Distance < t2Distance) {
        // return -1;
        // } else {
        // return 0;
        // }
        // });

        // SORTING WITHOUT ANONUMOYS INNER CLASS
        Collections.sort(taxis, new X(p));
    }
}

class X implements Comparator<Taxi> {
    Passenger p;

    public X(Passenger p) {
        this.p = p;
    }

    @Override
    public int compare(Taxi t1, Taxi t2) {
        double t1Distance = Location.getDistance(p.getLocation(), t1.getLocation());
        double t2Distance = Location.getDistance(p.getLocation(), t2.getLocation());
        if (t1Distance > t2Distance) {
            return 1;
        } else if (t1Distance < t2Distance) {
            return -1;
        } else {
            return 0;
        }
    }

}
