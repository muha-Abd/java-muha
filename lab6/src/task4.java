import java.util.Scanner;

public class task4 {

    // Рекурсивный метод вычисления факториала
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не существует.");
        }

        // Базовый случай
        if (n == 0 || n == 1) {
            return 1;
        }

        // Рекурсивный вызов
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        try {
            long result = factorial(number);
            System.out.println("Факториал числа " + number + " равен " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();
    }
}