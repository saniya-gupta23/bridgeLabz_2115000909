class Ticket {
    int ticketID;
    String customerName, movieName;
    int seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketID, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private Ticket last;
    private int count;

    public TicketReservationSystem() {
        last = null;
        count = 0;
    }

    public void addTicket(int ticketID, String customerName, String movieName, int seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);
        if (last == null) {
            last = newTicket;
            last.next = last;
        } else {
            newTicket.next = last.next;
            last.next = newTicket;
            last = newTicket;
        }
        count++;
    }

    public void removeTicket(int ticketID) {
        if (last == null) return;
        Ticket current = last.next, prev = last;
        do {
            if (current.ticketID == ticketID) {
                if (current == last && current.next == last) {
                    last = null;
                } else {
                    prev.next = current.next;
                    if (current == last) last = prev;
                }
                count--;
                return;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);
    }

    public void displayTickets() {
        if (last == null) return;
        Ticket temp = last.next;
        do {
            System.out.println(temp.ticketID + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
            temp = temp.next;
        } while (temp != last.next);
    }

    public void searchTicket(String key) {
        if (last == null) return;
        Ticket temp = last.next;
        do {
            if (temp.customerName.equalsIgnoreCase(key) || temp.movieName.equalsIgnoreCase(key)) {
                System.out.println(temp.ticketID + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
            }
            temp = temp.next;
        } while (temp != last.next);
    }

    public int totalTickets() {
        return count;
    }
}

public class TicketReservationApp {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        system.addTicket(1, "Alice", "Inception", 12, "10:00 AM");
        system.addTicket(2, "Bob", "Titanic", 15, "2:00 PM");
        system.displayTickets();
        system.searchTicket("Alice");
        system.removeTicket(1);
        system.displayTickets();
        System.out.println("Total Tickets: " + system.totalTickets());
    }
}
