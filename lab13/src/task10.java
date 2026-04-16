import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Comparator;

public class task10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 3, 12);

        Optional<Integer> min = numbers.stream()
                .min(Comparator.naturalOrder());

        if (min.isPresent()) {
            System.out.println("Минимальный элемент: " + min.get());
        } else {
            System.out.println("Список пуст");
        }
    }
}