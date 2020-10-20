package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] rsl = new int[left.length * left[0].length];
        for (int row = 0, i = 0; row < left.length; row++) {
            for (int cell = 0; cell < left[row].length; cell++, i++) {
                rsl[i] = Math.max(left[row][cell], right[row][cell]);
            }
        }
        return rsl;
    }
}
