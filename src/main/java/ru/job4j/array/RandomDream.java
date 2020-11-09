package main.java.ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        int index = num % prizes.length - 1;
        return prizes[index >= 0 ? index : prizes.length - 1];
    }
}
