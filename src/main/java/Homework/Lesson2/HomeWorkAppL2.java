package Homework.Lesson2;

import java.sql.SQLOutput;

public class HomeWorkAppL2 {
    public static void main(String[] args) {

        System.out.println(summation(5, 9));
        System.out.println();
        isPositiveOrNegative(10);
        System.out.println();
        System.out.println(isNegative(-2));
        System.out.println();
        printWordNTimes("Hello, Java!", 3);
        System.out.println();
        System.out.println(isLeapYear(2024));

    }

    public static boolean summation(int a, int b) {
        return 10 <= a + b & a + b <= 20;
    }

    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Это число положительное");
        } else {
            System.out.println("Это число отрицательное");
        }
    }

    public static boolean isNegative(int a) {
        return a <= 0;
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || (year % 400 == 0));
    }
}