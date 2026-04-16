import java.util.Arrays;
import java.util.List;

public class task8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Lambda", "Programming", "Code", "Stream");

        words.stream()
                .filter(str -> str.length() > 5)
                .forEach(System.out::println);
    }
}