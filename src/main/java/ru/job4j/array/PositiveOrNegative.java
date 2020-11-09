package main.java.ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int countNegative = 0;
        int countPositive = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }
        if (countNegative % 2 != 0) {
            return true;
        }
        return false;
    }
}
