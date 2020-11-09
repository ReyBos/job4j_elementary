package main.java.ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] rsl = new int[data.length];
        for (int i = 0, j = data.length - 1; i < data.length; i++, j--) {
            rsl[i] = data[i][j];
        }
        return rsl;
    }
}
