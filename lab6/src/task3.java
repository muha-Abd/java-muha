import java.util.Scanner;

public class task3 {

    // Метод определения чётности числа
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        // Вызов метода
        boolean result = isEven(number);

        // Вывод результата в понятном формате
        if (result) {
            System.out.println("Число " + number + " является чётным.");
        } else {
            System.out.println("Число " + number + " является нечётным.");
        }

        scanner.close();
    }
}