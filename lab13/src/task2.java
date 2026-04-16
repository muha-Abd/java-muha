import java.util.function.Function;

public class task2 {
    public static void main(String[] args) {
        Function<String, String> toUpperCase = str -> str.toUpperCase();

        String text = "hello world";
        String result = toUpperCase.apply(text);

        System.out.println("Результат: " + result);
    }
}