package Homework.Lesson7;

public class App {

    public static void main(String[] args) {

        Cat c1 = new Cat("Meow", 20);
        Cat c2 = new Cat("Bark", 30);
        Cat c3 = new Cat("Pussy", 100);

        Plate p1 = new Plate(100);

        p1.info();
        c1.eat(p1);
        p1.info();
        System.out.println();


        Plate p2 = new Plate(100);

        Cat[] cats = {c1, c2, c3};
        for (Cat cat : cats) {
            cat.eat(p2);
            p2.info();
        }

    }
}
