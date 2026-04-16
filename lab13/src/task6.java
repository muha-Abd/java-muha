import java.util.Arrays;
import java.util.List;

public class task6 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Lambda", "Code", "Programming", "Hi");

        words.stream()
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .forEach(System.out::println);
    }
}