package main.java.ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int raw = 0; raw < height; raw++) {
            for (int cell = 0; cell < width; cell++) {
                if ((raw + cell) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
