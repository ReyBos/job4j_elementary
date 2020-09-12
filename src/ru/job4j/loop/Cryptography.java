package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.length() == 0) {
            return "empty";
        }
        StringBuilder stringBuilder = new StringBuilder(s);
        if (stringBuilder.length() > 4) {
            for (int i = stringBuilder.length() - 5; i >= 0; i--) {
                stringBuilder.setCharAt(i, '#');
            }
        }
        return stringBuilder.toString();
    }
}
