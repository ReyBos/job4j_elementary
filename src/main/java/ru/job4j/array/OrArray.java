package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int size = add(rsl, left, 0);
        size = add(rsl, right, size);
        return Arrays.copyOf(rsl, size);
    }

    private static int add(int[] rsl, int[] array, int size) {
        for (int i = 0; i < array.length; i++) {
            boolean needAdd = true;
            for (int j = 0; j < rsl.length; j++) {
                if (rsl[j] == array[i]) {
                    needAdd = false;
                    break;
                }
            }
            if (needAdd) {
                rsl[size] = array[i];
                size++;
            }
        }
        return size;
    }
}
