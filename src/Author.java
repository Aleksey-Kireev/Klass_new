import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;
    private String sourName;

    public Author() {
    }

    public Author(String firstName, String lastName, String sourName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sourName = sourName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSourName() {
        return sourName;
    }

    public void setSourName(String sourName) {
        this.sourName = sourName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName) && Objects.equals(sourName, author.sourName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, sourName);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s ", firstName, lastName, sourName);
    }
}



