package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        Fact factorial = new Fact();
        System.out.println(factorial.calc(5));
        System.out.println(factorial.calc(-5));
    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The number must be positive");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
