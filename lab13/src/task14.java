import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " | age: " + age + " | grade: " + grade;
    }
}

public class task14 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Aliya", 20, 85),
                new Student("Daniyar", 19, 75),
                new Student("Aruzhan", 21, 90),
                new Student("Baurzhan", 22, 60)
        );

        students.stream()
                // фильтр по оценке > 80
                .filter(s -> s.grade > 80)
                // сортировка по имени
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);
    }
}