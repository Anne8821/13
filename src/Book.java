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
}