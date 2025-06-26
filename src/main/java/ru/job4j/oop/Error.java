package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;

    }

    public void printInfo() {
        System.out.println("Ошибка Активна: " + active);
        System.out.println("Код ошибки: " + status);
        System.out.println("Состояние: " + message);
    }

    public static void main(String[] args) {
        Error err1 = new Error();
        err1.printInfo();

        Error err2 = new Error(false, 2, "Test Failure");
        err2.printInfo();

        Error err3 = new Error(true, 1, "Test OK");
        err3.printInfo();
    }
}
