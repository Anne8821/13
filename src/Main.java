import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("level 1");
        Author somersetMaugham = new Author("Somerset","Maugham");
        Author somersetMaugham2 = new Author("Somerset","Maugham");

        System.out.println(somersetMaugham2.equals(somersetMaugham));

        Book firstBook = new Book("Christmas vacation", 1939, somersetMaugham);

        Book thirdBook = new Book("Christmas vacation", 1939, somersetMaugham);

        System.out.println(firstBook);

        System.out.println(firstBook.getName() + " " + firstBook.getYear() + " " + firstBook.getAuthor().getFirstName() + " " + firstBook.getAuthor());

        System.out.println(firstBook);
        Author franzKafka =new Author("Franz","Kafka");
        Book secondBook = new Book("Transformation", 1915, franzKafka);

        System.out.println("----test----");
        System.out.println(thirdBook.equals(firstBook));

        System.out.println(secondBook.equals(firstBook));

        System.out.println(firstBook.hashCode());
        System.out.println(secondBook.hashCode());
        System.out.println(thirdBook.hashCode());

        firstBook.setYear(2000);
        System.out.println(firstBook.getYear());

        System.out.println("Authors:");
        Author somersetWilliam = new Author("Somerset","William");
        Author somersetWilliam2 = new Author("Somerset","William");
        Author levTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("Author copies equal: " + somersetWilliam.equals(somersetWilliam2));
        System.out.println("Author copies equal by hashCode: " + (somersetWilliam.hashCode() == somersetWilliam2.hashCode()));
        System.out.println("Author equal: " + somersetWilliam.equals(levTolstoy));
        System.out.println("Author equal by hashCode: " + (somersetWilliam.hashCode() == levTolstoy.hashCode()));

        System.out.println(somersetWilliam);
        System.out.println(levTolstoy);

        System.out.println("---------------");

        System.out.println("Books:");

        Book theStand = new Book("An hour before dawn", 1942, somersetWilliam);

        Book theStand2 = new Book("An hour before dawn", 1942, somersetWilliam);
        Book warAndPeace = new Book("War and Peace", 1869, levTolstoy);
        System.out.println("Author copies equal: " + theStand.equals(theStand2));
        System.out.println("Author copies equal by hashCode: " + (theStand.hashCode() == theStand2.hashCode()));
        System.out.println("Author equal: " +theStand.equals(warAndPeace));
        System.out.println("Author equal by hashCode: " + (theStand.hashCode() == warAndPeace.hashCode()));
        System.out.println(theStand);
        System.out.println(warAndPeace);
    }
}