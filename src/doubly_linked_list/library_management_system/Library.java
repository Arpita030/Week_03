package doubly_linked_list.library_management_system;

public class Library {
    private Book head;
    private Book tail;
    private int bookCount;

    public Library() {
        this.head = null;
        this.tail = null;
        this.bookCount = 0;
    }

    public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        bookCount++;
        System.out.println("Book added at the beginning: " + title);
    }

    public void addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        bookCount++;
        System.out.println("Book added at the end: " + title);
    }

    public void addBookAtPosition(String title, String author, String genre, int bookId, boolean isAvailable, int position) {
        if (position < 1 || position > bookCount + 1) {
            System.out.println("Invalid position!");
            return;
        }

        if (position == 1) {
            addBookAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        } else if (position == bookCount + 1) {
            addBookAtEnd(title, author, genre, bookId, isAvailable);
            return;
        }

        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        Book current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }
        newBook.next = current.next;
        newBook.prev = current;
        current.next.prev = newBook;
        current.next = newBook;

        bookCount++;
        System.out.println("Book added at position " + position + ": " + title);
    }

    public void removeBookById(int bookId) {
        Book current = head;

        while (current != null) {
            if (current.bookId == bookId) {
                if (current == head) {
                    head = current.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = current.prev;
                    if (tail != null) tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                bookCount--;
                System.out.println("Book removed: " + current.title);
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    public void searchBook(String searchTerm) {
        Book current = head;
        boolean found = false;

        while (current != null) {
            if (current.title.equalsIgnoreCase(searchTerm) || current.author.equalsIgnoreCase(searchTerm)) {
                System.out.println("Book Found - Title: " + current.title + ", Author: " + current.author +
                        ", Genre: " + current.genre + ", Book ID: " + current.bookId +
                        ", Availability: " + (current.isAvailable ? "Available" : "Not Available"));
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("No book found with Title or Author: " + searchTerm);
        }
    }

    public void updateAvailabilityStatus(int bookId, boolean isAvailable) {
        Book current = head;

        while (current != null) {
            if (current.bookId == bookId) {
                current.isAvailable = isAvailable;
                System.out.println("Availability status updated for book: " + current.title +
                        " to " + (isAvailable ? "Available" : "Not Available"));
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    public void displayBooksForward() {
        Book current = head;

        System.out.println("\nBooks in forward order:");
        while (current != null) {
            System.out.println("Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre +
                    ", Book ID: " + current.bookId + ", Availability: " + (current.isAvailable ? "Available" : "Not Available"));
            current = current.next;
        }
    }

    public void displayBooksReverse() {
        Book current = tail;

        System.out.println("\nBooks in reverse order:");
        while (current != null) {
            System.out.println("Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre +
                    ", Book ID: " + current.bookId + ", Availability: " + (current.isAvailable ? "Available" : "Not Available"));
            current = current.prev;
        }
    }

    public void countBooks() {
        System.out.println("\nTotal number of books in the library: " + bookCount);
    }
}
