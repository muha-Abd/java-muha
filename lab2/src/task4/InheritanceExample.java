// Базовый класс
class Person {
    String name;
    int age;
}

// Производный класс
class Student extends Person {
    String group;
}

public class InheritanceExample {

    public static void main(String[] args) {
        Student student = new Student();

        // Инициализация полей базового класса
        student.name = "Иван";
        student.age = 20;

        // Инициализация поля производного класса
        student.group = "ИТ-21";

        // Демонстрация наследования
        System.out.println("Имя: " + student.name);
        System.out.println("Возраст: " + student.age);
        System.out.println("Группа: " + student.group);
    }
}
