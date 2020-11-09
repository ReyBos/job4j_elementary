package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int length = 1, tempLength = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                tempLength++;
            } else {
                length = Math.max(length, tempLength);
                tempLength = 1;
            }
        }
        length = Math.max(length, tempLength);
        return length;
    }
}
