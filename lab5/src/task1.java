import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем число N
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        // Выводим числа от 1 до N
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
