import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем число N
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        long factorial = 1;

        // Вычисляем факториал
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }

        // Вывод результата
        System.out.println("Факториал числа " + N + " равен: " + factorial);

        scanner.close();
    }
}
