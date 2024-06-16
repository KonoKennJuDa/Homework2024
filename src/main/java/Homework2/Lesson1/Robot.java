package Homework2.Lesson1;

public class Robot implements Athletics {

    private final int maxLength;
    private final int maxHeight;

    public Robot(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run(int length) {
        if (maxLength >= length) {
            System.out.println("Робот пробежал " + length);
        } else {
            System.out.println("Робот не преодолел расстояние " + length);
        }
    }

    @Override
    public void jump(int height) {
        if (maxHeight >= height) {
            System.out.println("Робот перепрыгнул " + height);
        } else {
            System.out.println("Робот не смог перепрыгнуть " + height);
        }
    }

}
