package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Oracle Database WorkBook", 240);
        Book book2 = new Book("Oracle Database Administrator", 350);
        Book book3 = new Book("Oracle Database Programmer", 450);
        Book book4 = new Book("Clean code", 350);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (Book book : books) {
            System.out.println(book.getName() + ": Pages " + book.getCountPages());
        }
        System.out.println(" ");
        System.out.println("Change indexs 0 3");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book : books) {
            System.out.println(book.getName() + ": Pages " + book.getCountPages());
        }
        System.out.println(" ");
        System.out.println("Only Book");
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + ": Pages " + book.getCountPages());
            }
        }
    }
}
