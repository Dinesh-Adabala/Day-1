public class ServiceTicket {
    private String date;
    private String time;
    private int lineNumber;

    public ServiceTicket(String date, String time, int lineNumber) {
       this.date = date;
       this.time = time;
       this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "ServiceTicket{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
