package doubly_linked_list.movie_management_system;

public class MovieLinkedList {
    private Movie head;
    private Movie tail;

    public void addAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    public void addAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        if (position == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        Movie newMovie = new Movie(title, director, year, rating);
        Movie current = head;
        int counter = 1;

        while (current != null && counter < position - 1) {
            current = current.next;
            counter++;
        }

        if (current == null) {
            System.out.println("Position out of bounds!");
            return;
        }

        newMovie.next = current.next;
        if (current.next != null) {
            current.next.prev = newMovie;
        } else {
            tail = newMovie;
        }
        newMovie.prev = current;
        current.next = newMovie;
    }

    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("No movies to remove!");
            return;
        }

        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next; // If the movie is at the head
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev; // If the movie is at the tail
                }
                System.out.println("Movie \"" + title + "\" removed.");
                return;
            }
            current = current.next;
        }

        System.out.println("Movie \"" + title + "\" not found.");
    }

    public void searchMovie(String directorOrRating) {
        boolean found = false;
        Movie current = head;

        try {
            double rating = Double.parseDouble(directorOrRating);
            while (current != null) {
                if (current.rating == rating) {
                    System.out.println("Found: " + current.title + " directed by " + current.director + " (" + current.year + "), Rating: " + current.rating);
                    found = true;
                }
                current = current.next;
            }
        } catch (NumberFormatException e) {
            // Not a number, so treat it as a director name
            while (current != null) {
                if (current.director.equalsIgnoreCase(directorOrRating)) {
                    System.out.println("Found: " + current.title + " directed by " + current.director + " (" + current.year + "), Rating: " + current.rating);
                    found = true;
                }
                current = current.next;
            }
        }

        if (!found) {
            System.out.println("Movie not found.");
        }
    }

    public void updateRating(String title, double newRating) {
        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                System.out.println("Rating updated for movie \"" + title + "\".");
                return;
            }
            current = current.next;
        }

        System.out.println("Movie \"" + title + "\" not found.");
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("No movies in the list.");
            return;
        }

        Movie current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.next;
        }
    }

    // Display all movies in reverse order
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies in the list.");
            return;
        }

        Movie current = tail;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.prev;
        }
    }
}
