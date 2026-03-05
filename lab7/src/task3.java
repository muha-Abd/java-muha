public class task3 {

    public static void main(String[] args) {
        double[] A = new double[12];
        double product = 1;
        for (int i = 0; i < 12; i++) {
            A[i] = (Math.random() * 20) - 10;
        }
        System.out.print("Массив A: ");
        for (int i = 0; i < 12; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        boolean hasNegative = false;
        for (int i = 0; i < 12; i++) {
            if (A[i] < 0) {
                product *= A[i];
                hasNegative = true;
            }
        }
        if (hasNegative) {
            System.out.println("Произведение отрицательных элементов массива: " + product);
        } else {
            System.out.println("Отрицательных элементов в массиве нет.");
        }
    }
}