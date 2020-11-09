package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public void show() {
        System.out.println("The cat name is " + this.name);
        System.out.println("Its food are " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
    }
}
