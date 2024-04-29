package Homework.Lesson6;

import java.util.Arrays;

public class ZooApp {

    public static void main(String[] args) {

        Animal cat = new Cat("Meow", 0, 200);
        cat.run(200);
        cat.swim(0);
        System.out.println();

        Animal dog = new Dog("Bark", 10, 500);
        dog.run(500);
        dog.swim(10);
        System.out.println();

        Animal[] animals = {cat, dog};
        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }
}
