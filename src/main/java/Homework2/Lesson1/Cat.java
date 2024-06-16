package Homework2.Lesson1;

public class Cat implements Athletics {

    private final int maxLength;
    private final int maxHeight;

    public Cat(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run(int length) {
        if (maxLength >= length) {
            System.out.println("Кот пробежал " + length);
        } else {
            System.out.println("Кот не преодолел расстояние " + length);
        }
    }

    @Override
    public void jump(int height) {
        if (maxHeight >= height) {
            System.out.println("Кот перепрыгнул " + height);
        } else {
            System.out.println("Кот не смог перепрыгнуть " + height);
        }
    }
}
