package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Alex Kuper");
        student.setGroup("G345");
        student.setReceipt(new Date());

        System.out.println("Студент " + student.getFio() + " поступил в группу " + student.getGroup() + " от " + student.getReceipt());
    }
}
