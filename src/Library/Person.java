package Library;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ім’я: " + name;
    }
}

