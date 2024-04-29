package Homework.Lesson6;

public class Cat extends Animal {

    public Cat(String name, int swim, int run) {
        super(name, swim, run);
    }

    @Override
    public void run(int distance) {
        if (run <= 200) {
            super.run(distance);
        } else {
            System.out.println(this.name + " не может бежать");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(this.name + " не может плыть");
    }
}
