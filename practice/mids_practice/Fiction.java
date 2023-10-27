public class Fiction extends Book implements Categorizable {
    private String subject;

    public void displayCategoryDetails() {
        System.out.println("Category: fiction, Subject: " + subject);
    }

    public Book clone() {
        return new Fiction(this.getTitle(), this.getAuthor(), this.getIsbn(), this.getStatus(), this.subject);
    }

    public Fiction(String title, String author, String isbn, Status status, String subject) {
        super(title, author, isbn, status);
        this.subject = subject;
    }

    public void showDetails() {
        System.out.println(super.toString());
        displayCategoryDetails();
    }

}
