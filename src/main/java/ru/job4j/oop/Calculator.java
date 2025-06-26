package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return x - b;
    }

    public int divide(int c) {
        return  c / x;
    }

    public int sumAllOperation(int num) {
        int sumRes = sum(num);
        int multiplyRes = multiply(num);
        int minusRes = minus(num);
        int divideRes = divide(num);
        return sumRes + multiplyRes + minusRes + divideRes;
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);

        Calculator calc = new Calculator();
        int result1 = calc.multiply(10);
        System.out.println(result1);

        int result2 = minus(10);
        System.out.println(result2);

        int result3 = calc.divide(10);
        System.out.println(result3);

        int result4 = calc.sumAllOperation(10);
        System.out.println(result4);

    }
}
