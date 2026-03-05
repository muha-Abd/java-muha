class task6 {

    public static void main(String[] args) {
        int[][] A = new int[10][10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                A[i][j] = (int) (Math.random() * 201) - 100; // числа от -100 до 100
            }
        }

        System.out.println("Массив A:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                if (A[i][j] < 0) {
                    sum += A[i][j];
                }
            }
            B[i] = sum;
        }

        System.out.println("\nСуммы отрицательных элементов по строкам (массив B):");
        for (int i = 0; i < 10; i++) {
            System.out.println(B[i]);
        }
    }
}