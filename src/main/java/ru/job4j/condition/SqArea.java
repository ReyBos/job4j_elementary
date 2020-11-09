package main.java.ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double b = p / (2 * (1 + k));
        double a = b * k;
        return a * b;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
    }
}
