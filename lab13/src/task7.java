import java.util.function.Function;

public class task7 {
    public static void main(String[] args) {
        Function<String, String> capitalize = str -> {
            if (str == null || str.isEmpty()) {
                return str;
            }
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        };

        String text = "hello world";
        String result = capitalize.apply(text);

        System.out.println("Результат: " + result);
    }
}