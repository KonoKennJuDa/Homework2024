package Homework2.Lesson1;

public class Human implements Athletics {

    private final int maxLength;
    private final int maxHeight;

    public Human(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run(int length) {
        if (maxLength >= length) {
            System.out.println("Человек пробежал " + length);
        } else {
            System.out.println("Человек не преодолел расстояние " + length);
        }
    }

    @Override
    public void jump(int height) {
        if (maxHeight >= height) {
            System.out.println("Человек перепрыгнул " + height);
        } else {
            System.out.println("Человек не смог перепрыгнуть " + height);
        }
    }
}
