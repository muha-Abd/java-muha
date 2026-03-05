class task9 {

    public static void main(String[] args) {
        int[][] C = new int[5][5];
        double product = 1;
        boolean hasPositive = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                C[i][j] = (int) (Math.random() * 21) - 10; // числа от -10 до 10
            }
        }

        System.out.println("Массив C:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            if (C[i][i] > 0) {
                product *= C[i][i];
                hasPositive = true;
            }
        }

        if (hasPositive) {
            System.out.println("\nПроизведение положительных элементов главной диагонали: " + product);
        } else {
            System.out.println("\nПоложительных элементов на главной диагонали нет.");
        }
    }
}