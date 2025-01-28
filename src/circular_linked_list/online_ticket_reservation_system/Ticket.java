package circular_linked_list.online_ticket_reservation_system;

class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId + ", Customer: " + customerName + ", Movie: " + movieName + ", Seat: " + seatNumber + ", Booking Time: " + bookingTime;
    }
}
