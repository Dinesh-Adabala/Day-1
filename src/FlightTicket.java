public class FlightTicket {
    private String flight;
    private String bordingTime;
    private String gateNo;
    private String seatNo;
    private String name;
    private String classs;
    private String from;
    private String to;

    public FlightTicket(String flight, String bordingTime, String gateNo, String seatNo, String name, String classs, String from, String to) {
        this.flight = flight;
        this.bordingTime = bordingTime;
        this.gateNo = gateNo;
        this.seatNo = seatNo;
        this.name = name;
        this.classs = classs;
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "FlightTicket{" +
                "flight='" + flight + '\'' +
                ", bordingTime='" + bordingTime + '\'' +
                ", gateNo='" + gateNo + '\'' +
                ", seatNo='" + seatNo + '\'' +
                ", name='" + name + '\'' +
                ", classs='" + classs + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
