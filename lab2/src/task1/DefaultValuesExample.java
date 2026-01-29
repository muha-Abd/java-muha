package task1;
public class DefaultValuesExample {

    static int number;
    static double price;
    static boolean isActive;

    static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        System.out.println("Значение int по умолчанию: " + number);
        System.out.println("Значение double по умолчанию: " + price);
        System.out.println("Значение boolean по умолчанию: " + isActive);
        System.out.println("Константа MAX_VALUE: " + MAX_VALUE);
    }
}
