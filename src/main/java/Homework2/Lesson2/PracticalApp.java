package Homework2.Lesson2;

public class PracticalApp {

    public static void main(String[] args) {

        // Корректный массив
        String[][] rightArr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        // Массив с неправильным размером
        String[][] wrongSizeArr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        // Массив с неправильными данными
        String[][] wrongDataArr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "d"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        try {
            System.out.println("Сумма всех элементов массива " + SumFirstAndSecond(rightArr));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Завершили задачу");
        }
    }

    public static int SumFirstAndSecond(String[][] arr) throws Exception {
        int sum = 0;
        if (arr.length != 4 || arr[0].length != 4)
            throw new MyArraySizeException("Массив не соответствует размерности 4х4!");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[j].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В переданном массиве элемент с Array[" + i + "][" + j + "] НЕ может быть конвертирован в число!!!");
                }
            }
        }
        return sum;
    }
}
