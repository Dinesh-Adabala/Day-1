public class BookingCounter {
    public static void main(String[]args){
        TempleServiceBooking t = new TempleServiceBooking();
        ServiceTicket ticketboked= t.booking(250);
        System.out.println ( ticketboked); }
}
