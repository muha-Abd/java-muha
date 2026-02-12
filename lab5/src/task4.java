public class task4 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 100) {
            if (i % 2 != 0) {   // если число нечётное
                i++;
                continue;       // пропускаем его
            }

            System.out.println(i);  // выводим только чётные
            i++;
        }
    }
}
