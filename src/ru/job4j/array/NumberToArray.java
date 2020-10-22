package ru.job4j.array;

import java.util.Arrays;

public class NumberToArray {
    public static int[] resolve(int number) {
        int[] rsl = new int[String.valueOf(number).length()];
        int i = 0;
        do {
            rsl[i++] = number % 10;
            number /= 10;
        } while (number > 0);
        return rsl;
    }
}