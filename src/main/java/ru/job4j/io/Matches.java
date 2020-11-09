package main.java.ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int matches = 11, choice;
        while (run) {
            do {
                System.out.println("Заберите от 1 до 3 спичек со стола");
                choice = Integer.valueOf(input.nextLine());
            } while (choice < 1 || choice > 3);
            matches -= choice;
            if (matches <= 0) {
                System.out.println("На столе осталось 0 спичек, вы победили!");
                run = false;
            } else {
                System.out.println("На столе осталось спичек:" + matches);
            }
        }
    }
}
