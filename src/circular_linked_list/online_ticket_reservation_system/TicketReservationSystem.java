package circular_linked_list.online_ticket_reservation_system;

import java.util.Scanner;

public class TicketReservationSystem {
    public static void main(String[] args) {
        CircularTicketQueue ticketQueue = new CircularTicketQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOnline Ticket Reservation System Menu:");
            System.out.println("1. Add Ticket Reservation");
            System.out.println("2. Remove Ticket Reservation");
            System.out.println("3. Display All Tickets");
            System.out.println("4. Search Ticket");
            System.out.println("5. Total Booked Tickets");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Ticket ID: ");
                    int ticketId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter Movie Name: ");
                    String movieName = scanner.nextLine();
                    System.out.print("Enter Seat Number: ");
                    String seatNumber = scanner.nextLine();
                    System.out.print("Enter Booking Time: ");
                    String bookingTime = scanner.nextLine();
                    ticketQueue.addTicket(ticketId, customerName, movieName, seatNumber, bookingTime);
                    break;

                case 2:
                    System.out.print("Enter Ticket ID to remove: ");
                    int removeTicketId = scanner.nextInt();
                    ticketQueue.removeTicket(removeTicketId);
                    break;

                case 3:
                    ticketQueue.displayTickets();
                    break;

                case 4:
                    System.out.print("Enter Customer Name or Movie Name to search: ");
                    String searchQuery = scanner.nextLine();
                    ticketQueue.searchTicket(searchQuery);
                    break;

                case 5:
                    ticketQueue.totalBookedTickets();
                    break;

                case 6:
                    System.out.println("Exiting the Ticket Reservation System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
