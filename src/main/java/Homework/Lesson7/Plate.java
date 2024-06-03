package Homework.Lesson7;

public class Plate {

    private int food; //Количество еды

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n) {
        if (isPlateEmpty()) {
            return;
        }
        if (n > food) {
            System.out.println("Тарелка пуста");
            food = 0;
        } else {
            this.food -= n;
        }
    }

    boolean isPlateEmpty() {
        return food == 0;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
