public class task1 {

    public static void main(String[] args) {
        int[] A = new int[20];
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            A[i] = (int) (Math.random() * 101) - 50;
        }
        System.out.print("Массив A: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            if (A[i] < 0) {
                sum += A[i];
            }
        }
        System.out.println("Сумма отрицательных элементов массива: " + sum);
    }
}