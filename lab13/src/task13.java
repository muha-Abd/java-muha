import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class task13 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Aliya", 25),
                new Person("Daniyar", 18),
                new Person("Aruzhan", 30)
        );

        people.stream()
                .sorted(Comparator.comparing(person -> person.age))
                .forEach(System.out::println);
    }
}