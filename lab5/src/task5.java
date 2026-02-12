import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        do {
            System.out.print("Введите число (0 для завершения): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Сумма введённых чисел: " + sum);

        scanner.close();
    }
}
