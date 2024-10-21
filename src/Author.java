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
    public boolean equals(Author other) {
        if (this.name.equals(other.name) && this.surname.equals(other.surname)) {
            return true;
        } else {
            return false;
        }

    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
