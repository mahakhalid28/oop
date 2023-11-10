public class Passenger {
    private Location location;
    private String name;

    public Passenger(Location location, String name) {
        this.location = location;
        this.name = name;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
