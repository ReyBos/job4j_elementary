package main.java.ru.job4j.array;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        for (int i = array.length - 2; i >= row; i--) {
            array[i + 1][column] = array[i][column];
        }
        for (int i = array.length - 2; i >= column; i--) {
            array[row][i + 1] = array[row][i];
        }
        for (int i = 1; i <= row; i++) {
            array[i - 1][column] = array[i][column];
        }
        for (int i = 1; i <= column; i++) {
            array[row][i - 1] = array[row][i];
        }
        array[row][column] = 0;
    }
}
