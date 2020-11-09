package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int size = findUnique(left, right, rsl, 0);
        size = findUnique(right, left, rsl, size);
        return Arrays.copyOf(rsl, size);
    }

    private static int findUnique(int[] left, int[] right, int[] rsl, int size) {
        for (int i = 0; i < left.length; i++) {
            boolean needToAdd = true;
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    needToAdd = false;
                    break;
                }
            }
            if (needToAdd) {
                rsl[size++] = left[i];
            }
        }
        return size;
    }
}
