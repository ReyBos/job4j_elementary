package main.java.ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int rsl = -1;
        for (int i = 0; i < string.length; i++) {
            if (number == 0) {
                break;
            }
            if (string[i] == c) {
                number--;
                rsl = i;
            }
        }
        return rsl;
    }
}
