package doubly_linked_list.movie_management_system;

import java.util.Scanner;

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieLinkedList movieList = new MovieLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Movie Management System ---");
            System.out.println("1. Add Movie at Beginning");
            System.out.println("2. Add Movie at End");
            System.out.println("3. Add Movie at Specific Position");
            System.out.println("4. Remove Movie by Title");
            System.out.println("5. Update Movie Rating");
            System.out.println("6. Search Movie");
            System.out.println("7. Display Movies (Forward)");
            System.out.println("8. Display Movies (Reverse)");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Movie Title, Director, Year, Rating: ");
                    movieList.addAtBeginning(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter Movie Title, Director, Year, Rating: ");
                    movieList.addAtEnd(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter Position, Title, Director, Year, Rating: ");
                    movieList.addAtPosition(scanner.nextInt(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextDouble());
                    break;
                case 4:
                    System.out.print("Enter Movie Title to Remove: ");
                    movieList.removeByTitle(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Enter Movie Title and New Rating: ");
                    movieList.updateRating(scanner.nextLine(), scanner.nextDouble());
                    break;
                case 6:
                    System.out.print("Enter Director or Rating to Search: ");
                    movieList.searchMovie(scanner.nextLine());
                    break;
                case 7:
                    movieList.displayForward();
                    break;
                case 8:
                    movieList.displayReverse();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
