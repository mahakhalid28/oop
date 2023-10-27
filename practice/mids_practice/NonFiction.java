public class NonFiction extends Book implements Categorizable {
    private String genre;

    public void displayCategoryDetails() {
        System.out.println("Category: fiction, Genre: " + genre);
    }

    public NonFiction(String title, String author, String isbn, Status status, String genre) {
        super(title, author, isbn, status);
        this.genre = genre;
    }

    public Book clone() {
        return new NonFiction(this.getTitle(), this.getAuthor(), this.getIsbn(), this.getStatus(), this.genre);
    }

    public void showDetails() {
        System.out.println(super.toString());
        displayCategoryDetails();
    }

}
