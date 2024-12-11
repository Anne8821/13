import java.util.Objects;

public class Book {
    String name;
    int year;
    Author author;

    public Book(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    String getName() {
        return name;
    }

    int getYear() {
        return year;
    }

    Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() { return Objects.hash(name, year, author) ; }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + name + '\'' +
                ", author=" + author +
                ", publishYear=" + year +
                '}';
    }
}
