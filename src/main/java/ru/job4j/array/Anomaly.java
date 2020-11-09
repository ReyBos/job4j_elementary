package main.java.ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        int start = -1, end = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= up || data[i] <= down) {
                if (start != -1 && i - end == 1) {
                    end++;
                    continue;
                } else if (start != -1 && i - end != 1) {
                    result[count++] = new int[] {start, end};
                }
                start = i;
                end = i;
            } else if (start != -1) {
                result[count++] = new int[] {start, end};
                start = -1;
                end = -1;
            }
        }
        if (start != -1) {
            result[count++] = new int[] {start, end};
        }
        return Arrays.copyOf(result, count);
    }
}
