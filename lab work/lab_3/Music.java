package lab_3;

public class Music {
    private String title;
    private Artist artist;
    private String duration;
    private String genere;
    private String albumName;
    private Date releaseDate;

    public Music(String title,
            Artist artist,
            String duration,
            String genere,
            String albumName,
            Date releaseDate) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genere = genere;
        this.albumName = albumName;
        this.releaseDate = releaseDate;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String toString() {
        return String.format("%s/%s/%s %s %s %s", title, artist, duration, genere, albumName, releaseDate);
    }

    public boolean equals(Object O) {
        Music M = (Music) O;
        if (M.getArtist().getName().equals(this.getArtist().getName())) {
            return true;
        } else {
            return false;
        }

    }
}
