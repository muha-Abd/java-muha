import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class task5{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 3, 47, 18);

        int max = numbers.stream()
                .max(Comparator.naturalOrder())
                .get();

        System.out.println("Максимальный элемент: " + max);
    }
}