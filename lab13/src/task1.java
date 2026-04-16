public class task1 {
    public static void main(String[] args) {
        java.util.function.BiFunction<Integer, Integer, Integer> sum =
                (a, b) -> a + b;

        int result = sum.apply(5, 3);
        System.out.println("Сумма: " + result);
    }
}