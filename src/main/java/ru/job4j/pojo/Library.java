package main.java.ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 700);
        Book javaHead = new Book("Java head", 752);
        Book monumentalJava = new Book("Monumental Java", 1520);
        Book computerScience = new Book("Computer science", 569);
        Book[] library = new Book[4];
        library[0] = cleanCode;
        library[1] = javaHead;
        library[2] = monumentalJava;
        library[3] = computerScience;
        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i].getTitle() + " - " + library[i].getPagesNumber());
        }
        Book temp = library[0];
        library[0] = library[3];
        library[3] = temp;
        for (int i = 0; i < library.length; i++) {
            if (library[i].getTitle().equals("Clean code")) {
                System.out.println(library[i].getTitle() + " - " + library[i].getPagesNumber());
            }
        }
    }
}
