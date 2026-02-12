import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем число N
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        int sum = 0;
        int i = 1;

        // Вычисляем сумму от 1 до N
        while (i <= N) {
            sum += i;
            i++;
        }

        // Вывод результата
        System.out.println("Сумма чисел от 1 до " + N + " равна: " + sum);

        scanner.close();
    }
}
