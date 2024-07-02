package Homework2.Lesson3;

import java.util.*;

public class Lesson3App {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Солнце", "Небо", "Солнце", "Привет", "Мама", "Брат", "Кум", "Сват", "Солнце", "Кум");

        System.out.println("Исходный список: ");
        list.forEach(System.out::println);
        System.out.println();

        System.out.println("Все значение и количество: ");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : list) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);
        System.out.println();

        System.out.println("Уникальные: ");
        Set<String> unique = new HashSet<>(list);
        unique.forEach(System.out::println);
        System.out.println();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "81234567894");
        phoneBook.add("Сидоров", "85493354825");
        phoneBook.add("Петров", "85492234825");
        phoneBook.add("Иванилов", "85493354994");
        phoneBook.add("Васильев", "85493556825");

        phoneBook.get("Иванов");
        phoneBook.get("Сидоров");
    }
}
