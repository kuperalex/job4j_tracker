package ru.job4j.checkstyle;

public class Broken {

    private int sizeOfEmpty = 10;
    String name;
    public String surname;
    public static final String NEWVALUE = "";

    void echo() {
    }

    void method(int a, int b, int c, int d, int e, int f, int g) {
    }

    private void broken() {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
        broken();
    }
}