package lesson12;

public class ternaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = (a < b) ? a : b; // переменная max = (выражение) ? значение if true : значение if false
        System.out.println(max);  // результат: переменному max присваивается значение 10. Так как выражение "true"
    }
}
