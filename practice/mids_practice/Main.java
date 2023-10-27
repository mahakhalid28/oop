import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Librarymanager l = new Librarymanager();

        User u1 = new User("123", "ahmed");
        User u2 = new User("567", "ali");
        Book b = new Fiction("little", "kazmi", "3456", Status.AVAILABLE, "novel");
        Book b1 = new Fiction("C++ Book", "Hammad", "123", Status.AVAILABLE, "programming");

        l.addBook(b);
        System.out.println("Added book " + b);
        l.addUser(u1);
        l.addUser(u2);

        try {
            l.borrowBook(u2, b);
            System.out.println("Borrowed book successfully");
            l.borrowBook(u2, b1);

            System.out.println("Borrowed book successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Book with isbn 3456 is: ");
        System.out.println(l.searchBook("3456"));
        try {
            u1.returnBook(b);

        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

        l.generateReport();

        Book temp = new Fiction(null, null, null, null, null);
        Book clone = temp.clone();
        // while (choice != -1) {
        // System.out.println("enter 0 to add nonFiction, 1 to add fiction,2 to search
        // book ,3 to borrow book, 4 to return book,-1 to exit");
        // choice= input.nextInt();
        // if(choice==0){
        // String titleName= input.next();
        // String authorName= input.next();
        // String isbn= input.next();

        // String genre= input.next();
        // l.addBook(new NonFiction(titleName, authorName, isbn, Status.AVAILABLE,
        // genre));

        // }
        // if(choice==2){
        // System.out.println("Enter book isbn to search");
        // String isbn = input.next();
        // l.searchBook(isbn);

        // }
        // if(choice==3){
        // l.borrowBook();
        // }

        // }

        // }

    }

}
