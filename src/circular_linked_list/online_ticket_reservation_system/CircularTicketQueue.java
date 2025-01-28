package circular_linked_list.online_ticket_reservation_system;

import java.util.Scanner;

class CircularTicketQueue {
    private Ticket head = null;
    private Ticket tail = null;

    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            tail = newTicket;
            tail.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
        System.out.println("Ticket reserved successfully!");
    }

    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket current = head, prev = null;
        do {
            if (current.ticketId == ticketId) {
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                } else if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }
                System.out.println("Ticket " + ticketId + " removed.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket ID not found!");
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets to display.");
            return;
        }

        Ticket current = head;
        System.out.println("\nBooked Tickets:");
        do {
            System.out.println(current);
            current = current.next;
        } while (current != head);
    }

    public void searchTicket(String searchQuery) {
        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }

        Ticket current = head;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(searchQuery) || current.movieName.equalsIgnoreCase(searchQuery)) {
                System.out.println("Ticket Found: " + current);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tickets found for '" + searchQuery + "'.");
        }
    }

    public void totalBookedTickets() {
        if (head == null) {
            System.out.println("No tickets booked yet.");
            return;
        }

        int count = 0;
        Ticket current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        System.out.println("Total number of booked tickets: " + count);
    }
}
