package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] rsl = new int[n];
        rsl[0] = a;
        rsl[1] = b;
        int sum = a + b;
        for (int i = 2; i < n; i++) {
            rsl[i] = sum;
            sum *= 2;
        }
        return rsl;
    }
}
