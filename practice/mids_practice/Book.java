public abstract class Book {
    private String title;
    private String author;
    private String isbn;
    private Status status;

    public static String getTitlesfromArray(Book[] books, int count) {

        String result = "";
        for (int i = 0; i < count; i++) {
            result += books[i].getTitle() + " , ";
        }
        return result;
    }

    public Book(String title, String author, String isbn, Status status) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.status = status;
    }

    public boolean equals(Object o) {
        if (o instanceof Book) {
            Book b = (Book) o;
            return b.isbn.equals(this.isbn);
        }
        return false;

    }

    public abstract void showDetails();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public abstract Book clone();

    @Override
    public String toString() {
        return "{" +
                " title='" + getTitle() + "'" +
                ", author='" + getAuthor() + "'" +
                ", isbn='" + getIsbn() + "'" +
                ", status='" + getStatus() + "'" +
                "}";
    }

}