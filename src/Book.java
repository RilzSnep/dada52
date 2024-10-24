import java.util.Objects;

public class Book {
    String name;
    Author author;
    int age;

    public Book(String name, Author author, int age) {
        this.age = age;
        this.author = author;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return author.toString() + ", написал книгу " + this.name + ", " + this.age + " лет назад.";
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, age);
    }
}
