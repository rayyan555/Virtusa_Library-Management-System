import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Transaction> transactions = new ArrayList<>();

   
    public void addBook(Book book) {
        books.add(book);
        System.out.println(" Book added!");
    }

    
    public void addUser(User user) {
        users.add(user);
        System.out.println("User added!");
    }

    
    public void searchBook(String keyword) {
        boolean found = false;

        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                b.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {

                System.out.println(b);
                found = true;
            }
        }

        if (!found) {
            System.out.println(" No books found!");
        }
    }

    
    public void issueBook(int bookId, String rollNo) {

        
        for (Book b : books) {
            if (b.getId() == bookId) {

                if (!b.isIssued()) {
                    b.setIssued(true);
                    transactions.add(new Transaction(bookId, rollNo));

                    System.out.println("Book issued successfully!");
                    return;

                } else {
                    System.out.println(" Book already issued!");
                    return;
                }
            }
        }

        System.out.println("Book not found!");
    }

   
    public void returnBook(int bookId) {

        for (Transaction t : transactions) {
            if (t.getBookId() == bookId && t.getReturnDate() == null) {

                LocalDate returnDate = LocalDate.now();
                t.setReturnDate(returnDate);

                long lateDays = ChronoUnit.DAYS.between(
                        t.getDueDate(), returnDate);

                if (lateDays > 0) {
                    System.out.println("💰 Fine: ₹" + (lateDays * 10));
                } else {
                    System.out.println(" Returned on time!");
                }

                
                for (Book b : books) {
                    if (b.getId() == bookId) {
                        b.setIssued(false);
                    }
                }

                return;
            }
        }

        System.out.println(" No active transaction found!");
    }
}