import java.util.Objects;

public class Author {
    String firstName;
    String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (null == o || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() { return Objects.hash(firstName,lastName) ; }

    @Override
    public String toString() {
        return "Автор{" +
                "furstname='" + firstName + '\''+
                ", lastname='" + lastName +'\''+
                '}';
        }
    }
