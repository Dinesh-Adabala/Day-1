public class PassPort {
    private String name;
    private String dateOfBirth;
    private String placeOfBirth;
    private String dateOfIssue;
    private  String dateOfExpiry;

    public PassPort(String name, String dateOfBirth, String placeOfBirth, String dateOfIssue, String dateOfExpiry) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.dateOfIssue = dateOfIssue;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public String toString() {
        return "PassPort{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", dateOfIssue='" + dateOfIssue + '\'' +
                ", dateOfExpiry='" + dateOfExpiry + '\'' +
                '}';
    }
}
