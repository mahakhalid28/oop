public class Location {
    private double x;
    private double y;

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static double getDistance(Location l1, Location l2) {
        double diffX = Math.pow(l1.x - l2.x, 2);
        double diffY = Math.pow(l1.y - l2.y, 2);
        return Math.sqrt(diffX + diffY);

    }

    @Override
    public String toString() {
        return "(" +
                " x='" + getX() + "'" +
                ", y='" + getY() + "'" +
                ")";
    }

}
