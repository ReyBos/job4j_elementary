package main.java.ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int length = 0;
        for (int i = 0; i < data.length; i++) {
            length += data[i].length;
        }
        int[] rsl = new int[length];
        for (int i = 0, count = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                rsl[count++] = data[i][j];
            }
        }
        return rsl;
    }
}
