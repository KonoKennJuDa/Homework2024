package Homework.Lesson7;

public class Cat {

    private String name; //Кличка
    private int appetite; //Количество потребляемой еды
    private final boolean full = false; //Сытость кота, которая изначально false
    private int hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public void findPlate(Plate[] plates) {
        for (Plate plate : plates) {
            if (plate.getFood() < appetite) {
                continue;
            }
            plate.decreaseFood(appetite);
            break;
        }
    }

}
