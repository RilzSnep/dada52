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


    public boolean equals(Book other) {
        return this.name.equals(other.getName()) && this.age == other.getAge();
    }

    public int hashCod() {
        return this.hashCode();
    }
}
