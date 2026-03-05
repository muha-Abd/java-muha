class task8 {

    public static void main(String[] args) {
        int[][] B = new int[5][5];
        int[] A = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                B[i][j] = (int) (Math.random() * 201) - 100; // числа от -100 до 100
            }
        }

        System.out.println("Массив B:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                if (B[i][j] > 0) {
                    sum += B[i][j];
                }
            }
            A[i] = sum;
        }

        System.out.println("\nСуммы положительных элементов по строкам (массив A):");
        for (int i = 0; i < 5; i++) {
            System.out.println(A[i]);
        }
    }
}