public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return "The person is " + name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
