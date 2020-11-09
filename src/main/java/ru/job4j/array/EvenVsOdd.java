package main.java.ru.job4j.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int sumFirst = 0, sumSecond = 0, rsl = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                sumFirst += players[i];
            } else {
                sumSecond += players[i];
            }
        }
        if (sumFirst > sumSecond) {
            rsl = 1;
        } else if (sumFirst < sumSecond) {
            rsl = 2;
        }
        return rsl;
    }
}
