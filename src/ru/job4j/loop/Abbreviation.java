package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        String[] words = s.split(" ");
        StringBuilder abbr = new StringBuilder();
        for (String word : words) {
            abbr.append(word.charAt(0));
        }
        return abbr.toString();
    }
}
