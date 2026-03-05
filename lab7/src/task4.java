public class task4 {

    public static void main(String[] args) {
        double[] C = new double[25];
        double product = 1;
        for (int i = 0; i < 25; i++) {
            C[i] = (Math.random() * 20) - 10;
        }
        System.out.print("Массив C: ");
        for (int i = 0; i < 25; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
        boolean hasPositive = false;
        for (int i = 0; i < 25; i++) {
            if (C[i] > 0) {
                product *= C[i];
                hasPositive = true;
            }
        }
        if (hasPositive) {
            System.out.println("Произведение положительных элементов массива: " + product);
        } else {
            System.out.println("Положительных элементов в массиве нет.");
        }
    }
}