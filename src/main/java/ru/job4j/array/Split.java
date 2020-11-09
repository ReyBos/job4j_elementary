package main.java.ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int commonCount = 0, start = 0, end = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == c) {
                result[commonCount++] = Arrays.copyOfRange(str, start, end);
                start = i + 1;
                end = start;
                continue;
            }
            end++;
        }
        result[commonCount] = Arrays.copyOfRange(str, start, end);
        return Arrays.copyOf(result, ++commonCount);
    }
}