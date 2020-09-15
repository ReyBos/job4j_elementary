package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0, l = 0, r = 0; i < rsl.length; i++) {
            if (l == left.length) {
                rsl[i] = right[r];
                r++;
                continue;
            } else if (r == right.length) {
                rsl[i] = left[l];
                l++;
                continue;
            }
            if (left[l] <= right[r]) {
                rsl[i] = left[l];
                l++;
            } else {
                rsl[i] = right[r];
                r++;
            }
        }
        return rsl;
    }
}
