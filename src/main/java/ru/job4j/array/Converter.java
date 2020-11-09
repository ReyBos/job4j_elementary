package main.java.ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int countElem = 0;
        for (int[] row : array) {
            countElem += row.length;
        }
        int size = (int) Math.ceil(Math.sqrt(countElem));
        int[][] rsl = new int[size][size];
        for (int row = 0, rowRsl = 0, cellRsl = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                rsl[rowRsl][cellRsl] = array[row][cell];
                cellRsl++;
                if (cellRsl == size) {
                    cellRsl = 0;
                    rowRsl++;
                }
            }
        }
        return rsl;
    }
}
