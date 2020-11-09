package ru.job4j.array;

public class WordsToText {
    public static String convert(String[] words) {
        String result = "";
        StringBuilder str = new StringBuilder();
        for (String word : words) {
            str.append(word + " ");
        }
        return str.toString().trim();
    }
}
