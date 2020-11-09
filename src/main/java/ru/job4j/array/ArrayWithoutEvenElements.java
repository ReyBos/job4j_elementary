package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int[] rsl = new int[data.length];
        int  counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                rsl[counter] = data[i];
                counter++;
            }
        }
        return Arrays.copyOf(rsl, counter);
    }
}