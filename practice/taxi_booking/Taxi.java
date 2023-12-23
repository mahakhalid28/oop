public class Taxi {
    private int id;
    static int count = 0;
    private Location location;

    public Taxi(Location location) {
        this.location = location;
        count++;
        id = count;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", location='" + getLocation() + "'" +
                "}";
    }

}
