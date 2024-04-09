package Homework.Lesson3;

import java.util.Arrays;

public class HomeWorkAppL3 {
    public static void main(String[] args) {

        invertArray();
        System.out.println();
        fillArray();
        System.out.println();
        changeArray();
        System.out.println();
        fillDiagonal();
        System.out.println();
        printArrayInConsole(retLenArr(6, 99));
        System.out.println();
        minMaxArray();
        System.out.println();
        array();

    }

    public static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static void fillArray() {
        int[] array = new int[100];
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value += 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillDiagonal() {
        int[][] array = new int[6][6];
        for (int i = 0; i < 6; i++) {
            array[i][i] = 1;
            array[i][array.length - i - 1] = 2;
            System.out.println(Arrays.toString(array[i]));
        }

    }

    public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    public static int[] retLenArr(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    public static void minMaxArray() {
        int[] array = {5, 3, 8, 4, 7, 2, 1};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }

    public static boolean checkBalance(int[] array) {
        int arraySum = 0;
        for (int i : array) {
            arraySum += i;
        }

        int rightSum = 0;
        for (int j : array) {
            rightSum += j;

            if (rightSum == arraySum - rightSum) {
                return true;
            }
        }
        return false;
    }

    public static void array() {
        int[] array = {11, 10, 1, 20};
        System.out.println(checkBalance(array));
    }
}


