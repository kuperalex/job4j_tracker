package ru.job4j.checkstyle;

public class Broken {
    private int sizeOfEmpty = 10;

    Broken() {
    }

    void echo() {
    }

    void method(int a, int b, int c, int d, int e, int f, int g) {

    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public String surname;

    public static final String NEWVVALUE = "";

}