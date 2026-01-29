public class ScopeExample {

    // Поле класса (переменная экземпляра)
    int classField = 100;

    public void showValues() {
        // Локальная переменная метода
        int localVariable = 50;

        System.out.println("Поле класса: " + classField);
        System.out.println("Локальная переменная метода: " + localVariable);
    }

    public static void main(String[] args) {
        ScopeExample example = new ScopeExample();
        example.showValues();
    }
}
