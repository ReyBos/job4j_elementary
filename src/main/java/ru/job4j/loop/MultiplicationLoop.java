package main.java.ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int result = a;
        for (int i = a + 1; i <= b; i++) {
            result *= i;
        }
        return result;
    }
}
