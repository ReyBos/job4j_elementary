package main.java.ru.job4j.pojo;

public class Book {
    private String title;
    private int pagesNumber;

    public Book(String title, int pagesNumber) {
        this.title = title;
        this.pagesNumber = pagesNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }
}
