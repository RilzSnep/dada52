import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Александ ", "Пушкин ");
        Author secondAuthor = new Author("Лев ", "Толстой ");

        Book firstBook = new Book("7 гномов", firstAuthor.getName() + firstAuthor.getSurname(), 20);
        Book secondBook = new Book("Красавица и чудовище", secondAuthor.getName() + secondAuthor.getSurname(), 25);
        System.out.println("Книга " + firstBook.getName() + ", написал " + firstBook.getAuthor() + firstBook.getAge() + " назад");
        System.out.println("Книга " + secondBook.getName() + ", написал " + secondBook.getAuthor() + secondBook.getAge() + " назад");
    }
}
