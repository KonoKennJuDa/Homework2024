package Homework.Lesson1;

import java.sql.SQLOutput;

public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        System.out.println();
        checkSumSign();
        System.out.println();
        printColor();
        System.out.println();
        compareNumber();

    }

    public static void printThreeWords() {
        System.out.println("Orange ");
        System.out.println("Banana ");
        System.out.println("Apple ");
    }

    public static void checkSumSign() {

        int a = 10;
        int b = 5;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {

        int v1 = 100;

        if (v1 <= 0) {
            System.out.println("RED");
        } if (v1 > 0 && v1 <= 100) {
            System.out.println("YELLOW");
        } if (v1 > 100) {
            System.out.println("GREEN");
        }
    }

    public static void  compareNumber() {

        int a = 20;
        int b = 20;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
