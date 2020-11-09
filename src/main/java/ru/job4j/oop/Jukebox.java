package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        String song = switch (position) {
            case 1 -> "Пусть бегут неуклюже";
            case 2 -> "Спокойной ночи";
            default -> "Песня не найдена";
        };
        System.out.println(song);
    }

    public static void main(String[] args) {
        Jukebox box = new Jukebox();
        box.music(1);
        box.music(4);
    }
}
