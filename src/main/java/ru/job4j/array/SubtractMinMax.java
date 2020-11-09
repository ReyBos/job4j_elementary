package ru.job4j.array;

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int max = ints[0];
        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (max < ints[i]) {
                max = ints[i];
            }
            if (min > ints[i]) {
                min = ints[i];
            }
        }
        return max - min;
    }
}
