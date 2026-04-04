import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== 📚 Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    lib.addBook(new Book(bookId, title, author));
                    break;

               
                case 2:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Roll No: ");
                    String rollNo = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    lib.addUser(new User(rollNo, name));
                    break;

                
                case 3:
                    sc.nextLine();
                    System.out.print("Enter keyword (title/author): ");
                    String keyword = sc.nextLine();

                    lib.searchBook(keyword);
                    break;

            
                case 4:
                    System.out.print("Enter Book ID: ");
                    int issueBookId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter User Roll No: ");
                    String issueRollNo = sc.nextLine();

                    lib.issueBook(issueBookId, issueRollNo);
                    break;

                
                case 5:
                    System.out.print("Enter Book ID: ");
                    int returnBookId = sc.nextInt();

                    lib.returnBook(returnBookId);
                    break;

                
                case 6:
                    System.out.println("👋 Exiting...");
                    System.exit(0);

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}