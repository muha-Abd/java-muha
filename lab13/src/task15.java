import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class task15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 3, 8, 20, 7, 15);

        numbers.stream()
                .filter(n -> n > 5)

                .map(n -> n * n)

                .sorted()

                .forEach(System.out::println);
    }
}