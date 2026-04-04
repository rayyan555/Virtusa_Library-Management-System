import java.time.LocalDate;

public class Transaction {
    private int bookId;
    private String userRollNo;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    public Transaction(int bookId, String userRollNo) {
        this.bookId = bookId;
        this.userRollNo = userRollNo;
        this.issueDate = LocalDate.now();
        this.dueDate = issueDate.plusDays(7);
        this.returnDate = null;
    }

    
    public int getBookId() {
        return bookId;
    }

    public String getUserRollNo() {
        return userRollNo;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}