package ru.job4j.oop;

public class Computer {

    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer() {

    }

    public void printInfo() {
        System.out.println("Много монторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer(true, 500, "Intel Core I7-10700K");
        Computer computer = new Computer();
        computer1.printInfo();
        computer.printInfo();
    }
}
