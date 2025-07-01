package ru.job4j.inheritance;

public class Enginner  extends Profession {
    private int experience;

    public Enginner(int experience, boolean degree) {
        super(degree);
        this.experience = experience;
    }
}
