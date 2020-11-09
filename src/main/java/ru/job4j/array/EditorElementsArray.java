package main.java.ru.job4j.array;

public class EditorElementsArray {
    public static int[][] changeData(int[][] array, int el) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] > el) {
                    array[row][cell] -= el;
                } else {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }
}
