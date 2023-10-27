class BookNotFoundException extends Exception {
    public BookNotFoundException(String m) {
        super(m);
    }

}

public class User {
    private Book[] borrowedBooks = new Book[20];
    private String password;
    private String username;
    private int currentIndex = 0;

    public User(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public void borrowBook(Book book) {
        borrowedBooks[currentIndex] = book;
        currentIndex++;
    }

    public int searchBook(Book book) {
        for (int i = 0; i < currentIndex; i++) {
            if (book.equals(borrowedBooks[i])) {
                return i;
            }
        }
        return -1;
    }

    public void returnBook(Book book) throws BookNotFoundException {
        int index = searchBook(book);
        if (index != -1) {
            for (int i = index; i < currentIndex - 1; i++) {
                borrowedBooks[i] = borrowedBooks[i + 1];
            }
            borrowedBooks[currentIndex - 1] = null;
            currentIndex--;
        } else {
            throw new BookNotFoundException("book  not found");
        }
    }

    public Book[] getBorrowedBooks() {
        return this.borrowedBooks;
    }

    public void setBorrowedBooks(Book[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

}
