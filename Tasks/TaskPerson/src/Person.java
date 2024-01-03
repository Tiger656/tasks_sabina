import java.util.Objects;

public class Person {

    private String name;
    private String id;
    private Date dateOfBirth;
    public Person(String name, int d, int m, int y, String id) {
        this.name = name;
        this.dateOfBirth = new Date(d, m,y);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean equals(Person other) {
        if (this == other) return true;
        if (other == null) return false;
        return Objects.equals(name, other.name) && Objects.equals(dateOfBirth, other.dateOfBirth);
    }

    public int compare(Person other) {
        if (this.dateOfBirth.equals(other.getDateOfBirth())) {
            return 0;
        }
       int thisDateInDays = this.dateOfBirth.getDay() + (this.dateOfBirth.getMonth() * 31) + (this.dateOfBirth.getYear() * 12 * 31);
       int otherDateInDays = this.dateOfBirth.getDay() + (this.dateOfBirth.getMonth() * 31) + (this.dateOfBirth.getYear() * 12 * 31);
       return thisDateInDays < otherDateInDays ? 1 : -1;
    }
}
