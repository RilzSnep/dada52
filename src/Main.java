import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Александ ", "Пушкин ");
        Author secondAuthor = new Author("Лев ", "Толстой ");

        Book firstBook = new Book("7 гномов", firstAuthor, 20);
        Book secondBook = new Book("Красавица и чудовище", secondAuthor, 20);
        System.out.println("Книга " + firstBook.getName() + ", написал " + firstBook.getAuthor().getName() + firstBook.getAuthor().getSurname() +" назад");
        System.out.println("Книга " + secondBook.getName() + ", написал " + secondBook.getAuthor().getName() + secondBook.getAuthor().getSurname() + " назад");
        System.out.println(secondBook.toString());
        System.out.println("Сравнивание годов двух книг '"+ firstBook.name +"' и '"+ secondBook.name +"' выдало: " + firstBook.equals(secondBook));
        System.out.println(firstBook.hashCode() == secondBook.hashCode());
        System.out.println(firstAuthor.hashCode() == secondAuthor.hashCode());

    }
}
