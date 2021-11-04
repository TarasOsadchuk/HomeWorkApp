package com.geekbrains;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = -10, b = 5;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительна");
        }
        if (result < 0) {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 95;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жултый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 20, b = 20;
        if (a > b || a == b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
