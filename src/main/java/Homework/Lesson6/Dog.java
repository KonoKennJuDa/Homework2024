package Homework.Lesson6;

public class Dog extends Animal {

    public Dog(String name, int swim, int run) {
        super(name, swim, run);
    }

    @Override
    public void run(int distance) {
        if (run >= 500) {
            super.run(distance);
        } else {
            System.out.println(this.name + " не может бежать");
        }
    }

    @Override
    public void swim(int distance) {
        if (swim <= 10) {
            super.swim(distance);
        } else {
            System.out.println(this.name + " не может плыть");
        }
    }
}
