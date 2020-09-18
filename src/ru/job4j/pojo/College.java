package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student petya = new Student();
        petya.setFullName("Перов Петр Петрович");
        petya.setGroup("406A");
        petya.setReceiptDate(LocalDate.now());
        System.out.println("student: " + petya.getFullName() + ", group: " + petya.getGroup() + ", receipt date: " + petya.getReceiptDate());
    }
}
