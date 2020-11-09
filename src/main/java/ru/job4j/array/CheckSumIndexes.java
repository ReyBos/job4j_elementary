package main.java.ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int[] rsl = new int[data.length * data.length];
        for (int row = 0, count = 0; row < data.length; row++) {
            for (int cell = 0; cell < data[row].length; cell++) {
                if (row + cell != sum) {
                    rsl[count] = data[row][cell];
                    count++;
                }
            }
        }
        int index = rsl.length - 1;
        for (int i = index; i >= 0; i--) {
            if (rsl[i] != 0) {
                break;
            }
            index = i;
        }
        return Arrays.copyOf(rsl, index);
    }
}
