package main.java.ru.job4j.array;

public class Decoding {
    public static int[] decode(int[] ints, int number) {
        int[] rsl = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            rsl[i] = ints[i] % number;
        }
        return rsl;
    }
}
