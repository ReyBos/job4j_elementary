package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        boolean result = true;
        String str = Integer.toString(i);
        for (int j = 0, k = str.length() - 1; j < str.length() / 2; j++, k--) {
            if (str.charAt(j) != str.charAt(k)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
