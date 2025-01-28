package doubly_linked_list.library_management_system;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book at Beginning");
            System.out.println("2. Add Book at End");
            System.out.println("3. Add Book at Specific Position");
            System.out.println("4. Remove Book by ID");
            System.out.println("5. Search for Book");
            System.out.println("6. Update Availability Status");
            System.out.println("7. Display Books Forward");
            System.out.println("8. Display Books Reverse");
            System.out.println("9. Count Total Books");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Title, Author, Genre, Book ID, Availability (true/false): ");
                    library.addBookAtBeginning(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),
                            scanner.nextInt(), scanner.nextBoolean());
                    break;
                case 2:
                    System.out.print("Enter Title, Author, Genre, Book ID, Availability (true/false): ");
                    library.addBookAtEnd(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),
                            scanner.nextInt(), scanner.nextBoolean());
                    break;
                case 3:
                    System.out.print("Enter Title, Author, Genre, Book ID, Availability (true/false), Position: ");
                    library.addBookAtPosition(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),
                            scanner.nextInt(), scanner.nextBoolean(), scanner.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Book ID to remove: ");
                    library.removeBookById(scanner.nextInt());
                    break;
                case 5:
                    System.out.print("Enter Title or Author to search: ");
                    library.searchBook(scanner.nextLine());
                    break;
                case 6:
                    System.out.print("Enter Book ID and new Availability (true/false): ");
                    library.updateAvailabilityStatus(scanner.nextInt(), scanner.nextBoolean());
                    break;
                case 7:
                    library.displayBooksForward();
                    break;
                case 8:
                    library.displayBooksReverse();
                    break;
                case 9:
                    library.countBooks();
                    break;
                case 10:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
