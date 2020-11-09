package main.java.ru.job4j.array;

public class Divider {
    public static boolean check(int num, int[] ints) {
        boolean rsl = true;
        for (int i = 0; i < ints.length; i++) {
            if (num % ints[i] != 0) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
