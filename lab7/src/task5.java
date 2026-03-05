class task5 {

    public static void main(String[] args) {
        int[] D = new int[17];
        int sum = 0;

        for (int i = 0; i < 17; i++) {
            D[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.print("Массив D: ");
        for (int i = 0; i < 17; i++) {
            System.out.print(D[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 17; i++) {
            sum += D[i];
        }

        double average = (double) sum / D.length;
        System.out.println("Среднее арифметическое элементов массива: " + average);
    }
}