import java.util.Scanner;

public class task1 {

    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        System.out.print("Введите высоту прямоугольника: ");
        double height = scanner.nextDouble();

        double area = rectangleArea(width, height);

        System.out.println("Площадь прямоугольника: " + area);

        scanner.close();
    }
}