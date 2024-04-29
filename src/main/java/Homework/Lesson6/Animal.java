package Homework.Lesson6;

public class Animal {

    protected String name; // Кличка животного
    protected int swim;
    protected int run;

    public Animal(String name, int swim, int run) {
        this.name = name;
        this.swim = swim;
        this.run = run;
    }

    public void run(int distance) {
        System.out.println(this.name + " бежит " + distance + " метров");
    }

    public void swim(int distance) {
        System.out.println(this.name + " плывет " + distance + " метров");
    }

    public String toString() {
        return name + " " + swim + " " + run;
    }

    public void info() {
        System.out.println(this);
    }
}
