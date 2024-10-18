public class Book {
    String name;
    String author;
    int age;

    public Book(String name, String author, int age) {
        this.age = age;
        this.author = author;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
