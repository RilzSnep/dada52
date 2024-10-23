import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Александ ", "Пушкин ");
        Author secondAuthor = new Author("Лев ", "Толстой ");

        Book firstBook = new Book("7 гномов", firstAuthor, 20);
        Book secondBook = new Book("Красавица и чудовище", secondAuthor, 20);
        System.out.println("Книга " + firstBook.getName() + ", написал " + firstBook.getAuthor().getName() + firstBook.getAuthor().getSurname() +" назад");
        System.out.println("Книга " + secondBook.getName() + ", написал " + secondBook.getAuthor().getName() + secondBook.getAuthor().getSurname() + " назад");
        System.out.println(" ");
        System.out.println(firstBook.equals(secondBook));
        System.out.println(firstAuthor);
        System.out.println(secondAuthor);
        System.out.println(firstAuthor.equals(secondAuthor));
        System.out.println(firstBook.hashCode());
        System.out.println(secondBook.hashCode());
        System.out.println(firstBook.hashCode());
        System.out.println(secondBook.hashCode());
    }
}