package main.java.ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean elem : data) {
            if (data[0] != elem) {
                result = false;
                break;
            }
        }
        return result;
    }
}
