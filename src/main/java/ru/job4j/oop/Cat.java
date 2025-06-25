package ru.job4j.oop;

public class Cat {

    private String name;

    private String food;

    public void giveNikc(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.giveNikc("Bob");
        cat.eat("Whiskas");
        cat.show();
    }
}

