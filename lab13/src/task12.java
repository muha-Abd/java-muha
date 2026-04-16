import java.util.function.Supplier;
import java.util.Random;

public class task12 {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> new Random().nextInt(100);

        System.out.println("Случайное число: " + randomNumber.get());
    }
}