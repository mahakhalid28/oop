package lab_3;

public class Artist {
    private String name;
    private String nationality;
    private int ratings;

    public Artist(String name, String nationality, int ratings) {
        this.name = name;
        this.nationality = nationality;
        this.ratings = ratings;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public String toString() {
        return String.format("%s/%s/%d", name, nationality, ratings);
    }

}
