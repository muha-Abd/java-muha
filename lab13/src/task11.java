import java.util.function.Consumer;

public class task11 {
    public static void main(String[] args) {
        Consumer<String> printer = str -> System.out.println(str);

        printer.accept("Hello, world!");
    }
}