package Homework2.Lesson3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    HashMap<String, ArrayList<String>> elements = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phones = elements.get(lastName);
        if (phones != null) {
            phones.add(phoneNumber);
        } else {
            phones = new ArrayList<>();
            phones.add(phoneNumber);
            elements.put(lastName, phones);
        }
    }

    public void get(String lastName) {
        System.out.println(lastName + " Контактный телефон:  " + elements.get(lastName));
    }
}
