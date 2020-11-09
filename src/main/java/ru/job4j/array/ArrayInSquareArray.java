package main.java.ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int size = (int) Math.ceil(Math.sqrt(array.length));
        int[][] rsl = new int[size][size];
        for (int i = 0, row = 0, cell = 0; i < array.length; i++) {
            rsl[row][cell] = array[i];
            cell++;
            if (cell == size) {
                cell = 0;
                row++;
            }
        }
        return rsl;
    }
}
