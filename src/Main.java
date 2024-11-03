import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Эрих","Ремарк");
        System.out.println(author1.getFirstName());

        Book book = new Book("Три товарища",1932,author1);
        System.out.println(book.getYear());

        book.setYear(1940);

        System.out.println(book.getYear());

        Author author2 = new Author("Федор","Достоевский");
        System.out.println(author2.getLastName());

        System.out.println(author2.getFirstName());
    }
}