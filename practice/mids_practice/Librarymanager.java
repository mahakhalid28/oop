
public class Librarymanager {
    private Book[] libraryInventory = new Book[30];
    private User[] users = new User[30];
    private int counterBook = 0;
    private int counterUser = 0;

    public Book searchBook(String isbn) {
        for (Book b : libraryInventory) {
            if (b.getIsbn().equals(isbn))
                return b;
        }
        return null;

    }

    public void borrowBook(User u, Book b) throws Exception {
        if (b.getStatus() == Status.AVAILABLE) {
            u.borrowBook(b);
            b.setStatus(Status.BORROWED);

        } else {
            throw new Exception("Book already borrowed");
        }

    }

    public void returnBook(User u, Book b) throws BookNotFoundException {
        u.returnBook(b);
        b.setStatus(Status.AVAILABLE);

    }

    public void addBook(Book book) {
        libraryInventory[counterBook] = book;
        counterBook++;
    }

    public void addUser(User user) {
        users[counterUser] = user;
        counterUser++;
    }

    public void generateReport() {
        System.out.println("================================================================");
        System.out.printf("%-20s%-20s%n", "Users", "Borrowed Books");
        System.out.println("================================================================");
        for (int i = 0; i < counterUser; i++) {
            System.out.printf("%-20s%-20s%n", users[i].getUsername(),
                    Book.getTitlesfromArray(users[i].getBorrowedBooks(), users[i].getCurrentIndex()));
        }

    }

}
