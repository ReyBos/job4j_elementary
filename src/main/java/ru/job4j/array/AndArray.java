package main.java.ru.job4j.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[] min = left.length >= right.length ? right : left;
        int[] max = left.length >= right.length ? left : right;
        int[] rsl = new int[min.length];
        int size = 0;
        for (int i = 0; i < min.length; i++) {
            for (int j = 0; j < max.length; j++) {
                if (min[i] == max[j]) {
                    rsl[size] = min[i];
                    size++;
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
