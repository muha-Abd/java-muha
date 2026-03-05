public class task2 {

    public static void main(String[] args) {
        int[] B = new int[15];
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            B[i] = (int) (Math.random() * 101) - 50;
        }
        System.out.print("Массив B: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            if (B[i] > 0) {
                sum += B[i];
            }
        }
        System.out.println("Сумма положительных элементов массива: " + sum);
    }
}