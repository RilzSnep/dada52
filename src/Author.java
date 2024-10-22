public class Author {
    String name;
    String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String toString() {
        return this.name + this.surname;
    }

    public boolean equals(Author author) {
        return this.name.equals(author.getName()) && this.surname.equals(author.getSurname());
    }

    public int hashCode() {
        return super.hashCode();
    }
}
